import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 360, 1); 
        
        
        Gangster gangster = new Gangster();
        Gangster1 gangster1 = new Gangster1();
        gangster2 Gangster2 = new gangster2();
        addObject(gangster, 45, 300);
        addObject(gangster1, 450, 300);
        addObject(Gangster2, 330, 300);
        
    }
}
