import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class box_AudioPort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class box_AudioPort extends Actor
{
    /**
     * Act - do whatever the box_AudioPort wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("audio_port.wav");
        }
    }    
}
