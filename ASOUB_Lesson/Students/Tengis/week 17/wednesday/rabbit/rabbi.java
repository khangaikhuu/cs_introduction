import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rabbi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rabbi extends Actor
{
    /**
     * Act - do whatever the rabbi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int dx=0, dy=0;
if (Greenfoot.isKeyDown("up")) dy--;
if (Greenfoot.isKeyDown("down")) dy++;
if (Greenfoot.isKeyDown("right")) dx++;
if (Greenfoot.isKeyDown("left")) dx--;
if (dx != 0 || dy != 0) setLocation(getX()+dx, getY()+dy);
    }    
}
