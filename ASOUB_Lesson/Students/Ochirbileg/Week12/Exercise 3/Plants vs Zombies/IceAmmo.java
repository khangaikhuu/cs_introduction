import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IceAmmo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IceAmmo extends Plant7
{
    /**
     * Act - do whatever the IceAmmo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() + speed, getY());
   }
   private int speed = 50;
}
