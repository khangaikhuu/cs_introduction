import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PandaWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PandaWorld extends World
{

    /**
     * Constructor for objects of class PandaWorld.
     * 
     */
    public PandaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1); 
        //Create a Panda object
        Panda bear = new Panda();
        // add Panda to the world
        addObject(bear, 100, getHeight()/2);
        
        //Create a White object
        White black = new White();
        // add White to the world
        addObject(black, 101, getHeight()/2);
        
    }
  
}
