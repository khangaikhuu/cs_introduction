import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dracula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dracula extends Actor
{
    /**
     * Act - do whatever the Dracula wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         if (Greenfoot.mouseClicked(this)) {
             Greenfoot.playSound("hohoho.wav");
    }
    }    
}
