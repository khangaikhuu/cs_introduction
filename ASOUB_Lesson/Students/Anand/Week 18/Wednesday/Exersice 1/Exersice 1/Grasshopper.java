import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grasshopper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grasshopper extends Actor
{
    /**
     * Act - do whatever the Grasshopper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 5, getY());
            Greenfoot.playSound("Crick.wav");
        }    
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 5, getY());
            Greenfoot.playSound("Crick.wav");
        }    
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX() , getY()+ 5);
            Greenfoot.playSound("Crick.wav");
        }    
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX () , getY()- 5);
            Greenfoot.playSound("Crick.wav");
        } 
        
    }    
}
