import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class or here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class or extends Actor
{
    /**
     * Act - do whatever the or wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            setLocation(300,200);
            Greenfoot.playSound("people076.wav");
            
        }
    }    
}
