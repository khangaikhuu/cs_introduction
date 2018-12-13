import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class box_ram_slot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class box_ram_slot extends Actor
{
    /**
     * Act - do whatever the box_ram_slot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("ram_slot.wav");
        }
    }    
}
