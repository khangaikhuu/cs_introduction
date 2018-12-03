import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author Jacob Schwartz 
 * @version 1.0
 */
public class World3 extends World
{

    /**
     * Constructor for objects of class World1.
     * Creates world, sets objects
     */
    public World3()
    {    
        // Create a new world with 620x200 cells with a cell size of 1x1 pixels.
        super(620, 200, 1); 
        addObject(new Ryu(), 100, 150);
        addObject(new Ken(), 520, 158);
    }
}
