import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ram2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ram2 extends Actor
{
    /**
     * Act - do whatever the ram2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("ram.wav");
        }
    }    
}