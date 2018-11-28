import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ram extends Actor
{
    /**
     * Act - do whatever the Ram wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.\
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("au.wav");
        }
    }    
}
