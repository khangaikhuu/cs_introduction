import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class box_proccesor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class box_proccesor extends Actor
{
    /**
     * Act - do whatever the box_proccesor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("CPU.wav");
        }
    }    
}
