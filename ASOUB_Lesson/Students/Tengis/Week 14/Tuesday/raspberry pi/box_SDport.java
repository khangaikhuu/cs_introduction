import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class box_SDport here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class box_SDport extends Actor
{
    /**
     * Act - do whatever the box_SDport wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("MicroSD_port.wav");
        }
    }    
}
