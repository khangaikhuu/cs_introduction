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
        //Positioning numpad
        addObject (one,500
        addObject (two,
        addObject (three,
        addObject (four,
        addObject (five,
        addObject (six,
        addObject (seven,
        addObject (eight,
        addObject (nine,
        addObject (zero,
        //Positioning functions
        addObject (minus,
        addObject (plus,
        addObject (multiply,
        addObject (division,
        addObject (sq2,
        
        
        
    }
}
