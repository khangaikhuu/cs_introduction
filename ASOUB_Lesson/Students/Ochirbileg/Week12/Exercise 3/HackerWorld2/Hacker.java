import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hacker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hacker extends Actor
{
    private GreenfootSound speakSound;
    /**
     * Act - do whatever the Hacker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        speakSound = new GreenfootSound("au.wav");
        if (Greenfoot.mouseClicked(this))
        {
            speakSound = new GreenfootSound("au.wav");
        }  
    }
}
