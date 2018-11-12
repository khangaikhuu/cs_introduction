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
        super(600, 400, 1); 
        Earth e = new Earth();
        addObject(e, 300, 200);
        Moon m = new Moon();
        addObject(m, 100, 200);
        Satellite s1 = new Satellite();
        Satellite s2 = new Satellite();
        Satellite s3 = new Satellite();
        Satellite s4 = new Satellite();
        Satellite s5 = new Satellite();
        addObject(s1, 200, 30);
        addObject(s2, 350, 30);
        addObject(s3, 200, 300);
        addObject(s4, 450, 200);
        addObject(s5, 300, 350);
    }
}
