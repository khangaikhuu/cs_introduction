import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Calculator extends World
{
    public Calculator()
 
    {
        super (800,600,1);
        One one = new One();
        Two two = new Two();
        Three three = new Three();
        Four four = new Four();
        Five five = new Five();
        Six six = new Six();
        Seven seven = new Seven();
        Eight eight = new Eight();
        Nine nine = new Nine();
        Zero zero = new Zero();
        minus minus = new minus();
        Clear clear = new Clear();
        division division = new division();
        multiply multiply = new multiply();
        plus plus = new plus();
        sq2 sq2 = new sq2();
        Result_box a = new Result_box();
        //Positioning numpad
        addObject (one,100,200);
        addObject (two,250,200);
        addObject (three,400,200);
        addObject (four,100,275);
        addObject (five,250,275);
        addObject (six,400,275);
        addObject (seven,100,350);
        addObject (eight,250,350);
        addObject (nine,400,350);
        addObject (zero,250,425);
        //Positioning functions
        addObject (minus,575,200);
        addObject (plus,725,200);
        addObject (multiply,575,275);
        addObject (division,725,275);
        addObject (sq2,575,350);
        addObject (clear, 725,350);
        addObject (a,400,75);
        
        
        
    }
}
