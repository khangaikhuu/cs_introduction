import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWaterWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWaterWorld extends World
{

    /**
     * Constructor for objects of class MyWaterWorld.
     * 
     */
    public MyWaterWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 450, 1);
        Whale whale = new Whale();
        addObject(whale, 400, 300);
    }
}
