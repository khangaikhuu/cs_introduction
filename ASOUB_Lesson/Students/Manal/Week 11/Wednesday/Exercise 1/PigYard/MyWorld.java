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
        super(600, 300, 1);
        Pig p1 = new Pig();
        Pig p2 = new Pig();
        Pig p3 = new Pig();
        Pig p4 = new Pig();
        Pig p5 = new Pig();
        addObject(p1, 70, 250);
        addObject(p2, 150, 250);
        addObject(p3, 225, 250);
        addObject(p4, 300, 250);
        addObject(p5, 375, 250);
        Swamp swamp = new Swamp();
        addObject(swamp, 500, 200);
    }
}
