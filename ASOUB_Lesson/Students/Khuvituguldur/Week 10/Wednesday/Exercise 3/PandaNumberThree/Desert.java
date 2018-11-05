import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Desert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desert extends World
{

    /**
     * Constructor for objects of class Desert.
     * 
     */
    public Desert()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        //creat Bear object
        Bear bear= new Bear();
        // add Bear to the world
        addObject(bear, 100, getHeight()/2);
    }
    
}
