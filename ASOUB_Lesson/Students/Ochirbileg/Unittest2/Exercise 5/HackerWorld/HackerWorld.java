import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HackerWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HackerWorld extends World
{

    /**
     * Constructor for objects of class HackerWorld.
     * 
     */
    public HackerWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Hacker hacker = new Hacker();
        addObject(hacker,300,250);
        talk();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void talk()
    {
        Greenfoot.playSound("");
    }
}
