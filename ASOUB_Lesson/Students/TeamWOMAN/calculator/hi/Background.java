 import greenfoot.Greenfoot;
 import greenfoot.World;
 import java.io.PrintStream;
 
 public class Background extends World
 {
   Buttons[] Button = new Buttons[20];
   Labels[] Label = new Labels[20];
   String[] LabelText = { "Clear", "null", "null", "+|-", "+", "-", "*", "/", "1", "2", "3", "=", "4", "5", "6", ".", "7", "8", "9", "0" };
 
   String mem = ""; String display = "0";
   float val1;
   float val2;
   float[] value = { val1, val2 };
   int valNum = 0; int eqA = 0;
   boolean eqDisplay = false; boolean tempDisplay = false;

   public Background()
   {
     super(250, 350, 1, false);
     for (int i = 0; i < 20; i++) {
         Button[i] = new Buttons();
      Label[i] = new Labels(LabelText[i]);
      Button[i].setImage("button-yellow.png");
       if (i > 0) { Button[i].setImage("button-yellow.png");
        if (i > 7) { Button[i].setImage("button-green.png");
          if (i > 18) Button[i].setImage("button-green.png"); 
         }
      }
      addObject(Button[i], 35 + i % 4 * 60, 80 + (int)Math.floor(i / 4) * 60);
       addObject(Label[i], 24 + LabelText[i].length() * 7 + i % 4 * 60, 80 + (int)Math.floor(i / 4) * 60);
    }
     TextField TextBox = new TextField("0");
     addObject(TextBox, 235, 25);
     Greenfoot.start();
   }
 
   public void act()
   {
    for (int a = 0; a < 20; a++)
       if (((Greenfoot.mouseClicked(Button[a])) || (Greenfoot.mouseClicked(Label[a]))) && 
       (display.length() < 9)) {
        removeObjects(getObjects(TextField.class));
        switch (a) { 
       default:
         if (((display == "0") && (LabelText[a] != ".")) || (display == "") || (eqDisplay == true)) {
          display = LabelText[a];
             eqDisplay = false;
          }
          else {
             display += LabelText[a];
           }break;
         case 0:
            value[0] = 0.0F; value[1] = 0.0F; display = "0"; valNum = 0; break;
         case 1:
            mem = display; break;
         case 2:
           display = mem; break;
         case 3:
            if (display.contains("-"))
             display = display.substring(1);
           else
              display = ("-" + display);
           break;
         case 4:
         case 5:
         case 6:
         case 7:
            eqA = a;
            eqDisplay = true;
         case 19:
            if (valNum == 1) {
              value[1] = Float.valueOf(display).floatValue();
              System.out.print(value[0] + " ");
              System.out.println(value[1]);
              switch (eqA) {
             case 4:
                value[0] += value[1];
                break;
             case 5:
                value[0] -= value[1];
                break;
             case 6:
                value[0] *= value[1];
                break;
            case 7:
                value[0] /= value[1];
             }
 
              if (a == 19) {
                display = ("" + value[0]);
                if (value[0] == (int)value[0]) 
                  display = ("" + (int)value[0]);
                } else {
                display = "0";
             }
              valNum = 0;
           } else {
              value[0] = Float.valueOf(display).floatValue();
 
              if (a != 19) {
                valNum = 1;
                display = "0";
             }
           }
           break;
        }

         if (eqDisplay == true) {
           TextField TextBox = new TextField(LabelText[a]);
           addObject(TextBox, 235, 25);
           eqDisplay = false;
         } else {
           TextField TextBox = new TextField(display);
          addObject(TextBox, 235, 25);
       }
       }
   }
 }

