import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cemel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cemel extends Actor
{
    public void act() 
    {
        
        if (Greenfoot.mouseClicked(this))
        {
           Greenfoot.playSound ("au.wav");
           getWorld().addObject (new BabyBoi(), 200, 180);
           getWorld().addObject( new BabyGorl(), 200, 200);
        }
    }    
}
