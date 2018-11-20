import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HDD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HDD extends Actor
{
    /**
     * Act - do whatever the HDD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("hdd.wav");
        }
    }    
}
