 import greenfoot.Greenfoot;
 import greenfoot.World;
 import java.io.PrintStream;
 
 public class Background extends World
 {
   Buttons[] Button = new Buttons[20];// new button is created
   Labels[] Label = new Labels[20]; // new label is created
   String[] LabelText = { "Clear", "null", "null", "+|-", "+", 
       "-", "*", "/", "1", "2", "3", "=", 
       "4", "5", "6", ".", "7", "8", "9", "0" }; // its the label of the calculator buttons
 
   String mem = ""; // string is labeled as mem
   String display = "0"; // string is labeled as 0
   float val1; // float typed val1 is defined
   float val2; // float typed val2 is defined
   float[] value = { val1, val2 }; // value equals val1 and val2
   int valNum = 0; int eqA = 0;//int valNum and int eqA is equal to 0
   boolean eqDisplay = false; boolean tempDisplay = false;// boolean equals 0

   public Background()
   {
     super(250, 350, 1, false);
     for (int i = 0; i < 20; i++) {
         Button[i] = new Buttons();// new button is created
      Label[i] = new Labels(LabelText[i]);// new label is created
      Button[i].setImage("button-yellow.png"); // button image
       if (i > 0) { Button[i].setImage("button-yellow.png"); // set image for yellow button
        if (i > 7) { Button[i].setImage("button-green.png"); // set image for green button
          if (i > 18) Button[i].setImage("button-green.png"); // set image for green button
         }
      }
      addObject(Button[i], 35 + i % 4 * 60, 80 + (int)Math.floor(i / 4) * 60);
       addObject(Label[i], 24 + LabelText[i].length() * 7 + i % 4 * 60, 80 + (int)Math.floor(i / 4) * 60);
    }
     TextField TextBox = new TextField("0");// new TextField is created
     addObject(TextBox, 235, 25);// new TextBox is created
     Greenfoot.start();
   }
 
   public void act()// new void is created
   {
    for (int a = 0; a < 20; a++)
       if (((Greenfoot.mouseClicked(Button[a])) || (Greenfoot.mouseClicked(Label[a]))) && 
       (display.length() < 9)) {
        removeObjects(getObjects(TextField.class));// object gets removed
        switch (a) { // switched a
       default:
         if (((display == "0") && (LabelText[a] != ".")) || (display == "") || (eqDisplay == true)) {
          display = LabelText[a];
             eqDisplay = false;// displaye as false
          }
          else {
             display += LabelText[a];
           }break;
         case 0:
            value[0] = 0.0F; value[1] = 0.0F; display = "0"; valNum = 0; break; // valNum is case 0
         case 1:
            mem = display; break; // display with break
         case 2:
           display = mem; break; // mem with break
         case 3:
            if (display.contains("-")) // display containing  "-"
             display = display.substring(1); // display 1
           else
              display = ("-" + display);// display "-" is displaying
           break;
         case 4: // labels case 4
         case 5: // labels case 5
         case 6: // labels case 6
         case 7: // labels case 7
            eqA = a; // shows eqA is same as a
            eqDisplay = true; // displays eqDisplay is true
         case 19:// labels case 19
            if (valNum == 1) {
              value[1] = Float.valueOf(display).floatValue();// Float value is displayed
              System.out.print(value[0] + " ");
              System.out.println(value[1]);
              switch (eqA) {
             case 4:
                value[0] += value[1];
                break; // case 4 is broken
             case 5:
                value[0] -= value[1];
                break; // case 5 is broken
             case 6:
                value[0] *= value[1];
                break; // case 6 is broken
            case 7:
                value[0] /= value[1];
             }
 
              if (a == 19) {
                display = ("" + value[0]); // displays value
                if (value[0] == (int)value[0]) 
                  display = ("" + (int)value[0]);// displays vale with int
                } else {
                display = "0";// value displayed as 0
             }
              valNum = 0; // valNum is equal to 0
           } else {
              value[0] = Float.valueOf(display).floatValue(); // float value is displayed
 
              if (a != 19) {
                valNum = 1; // displays valNum is 1 
                display = "0";// displays display is 0
             }
           }
           break; // taking a break
        }

         if (eqDisplay == true) {
           TextField TextBox = new TextField(LabelText[a]);// new TextField is created
           addObject(TextBox, 235, 25);// new TextBox is created
           eqDisplay = false;
         } else {
           TextField TextBox = new TextField(display);// new TextField is created
          addObject(TextBox, 235, 25);// new TextBox is created
       }
       }
   }
 }

