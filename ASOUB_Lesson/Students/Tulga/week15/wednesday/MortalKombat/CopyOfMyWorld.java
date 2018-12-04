import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfMyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopyOfMyWorld extends World
{

    /**
     * Constructor for objects of class CopyOfMyWorld.
     * 
     */
    public CopyOfMyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Tanya p1 = new Tanya ();
        addObject(p1, 100,300);
        armageddon p2 = new armageddon ();
        addObject(p2, 500,300);
        
    }
}
