import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DarkRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DarkRoom extends World
{
    private GreenfootSound backgroundSound;
    /**
     * Constructor for objects of class DarkRoom.
     * 
     */
    public DarkRoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Hacker hacker = new Hacker();
        addObject(hacker,300,260);
        backgroundSound = new GreenfootSound("au.wav");
        backgroundSound.playLoop();
        if (Greenfoot.mouseClicked(this))
        {
            backgroundSound.stop();
        }
    }
}
