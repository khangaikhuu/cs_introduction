import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GodlyPower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GodlyPower extends Zombie1
{
    /**
     * Act - do whatever the GodlyPower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(0 + speed, getY());
    }
    private int speed = 50;
}    
