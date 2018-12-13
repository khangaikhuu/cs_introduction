import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ram3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ram3 extends Actor
{
    /**
     * Act - do whatever the ram3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("ram.wav");
        }
    }    
}
