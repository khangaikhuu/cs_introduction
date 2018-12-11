import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class box_LANport here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class box_LANport extends Actor
{
    /**
     * Act - do whatever the box_LANport wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("LAN_port.wav");
        }
    }    
}
