import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cow1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cow1 extends Actor
{
    /**
     * Act - do whatever the Cow1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            setLocation(getX() - 20, getY());
            Greenfoot.playSound("Moo.wav");
        }
    }    
}
