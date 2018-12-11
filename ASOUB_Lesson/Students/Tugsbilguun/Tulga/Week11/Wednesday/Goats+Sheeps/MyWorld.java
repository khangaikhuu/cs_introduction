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
        Goat g1 = new Goat();
        addObject ( g1, 200,800);
        Goat g2 = new Goat();
        addObject ( g2, 300,500);
        Goat g3 = new Goat();
        addObject ( g3, 400,500);
        Goat g4 = new Goat ();
        addObject ( g4, 500,500);
        Goat g5 = new Goat ();
        addObject ( g5, 100,500);
        Sheep s1 = new Sheep ();
        addObject ( s1, 100,300);
        Sheep s2 = new Sheep ();
        addObject ( s2, 200,300);
        Sheep s3 = new Sheep ();
        addObject (s3, 300,300);
        Sheep s4 = new Sheep ();
        addObject (s4, 400,300);
        Sheep s5 = new Sheep();
        addObject (s5, 500,300);
        
        
    }
}
