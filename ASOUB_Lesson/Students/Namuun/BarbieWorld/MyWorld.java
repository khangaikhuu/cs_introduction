import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public MyWorld()
    {
        super(640, 360, 1);
        
        Barbie barbie = new Barbie ();
        addObject (barbie, 90, 220);
        
        Kiera doll = new Kiera ();
        addObject (doll, 600, 220);
    }
}
