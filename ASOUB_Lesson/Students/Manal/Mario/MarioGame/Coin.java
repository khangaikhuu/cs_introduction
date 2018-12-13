import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    public void act() 
    {
        Actor b = this.getOneIntersectingObject(Mario.class);
        if (b != null){
            getWorld().removeObject(this);
        }
    }    
}

