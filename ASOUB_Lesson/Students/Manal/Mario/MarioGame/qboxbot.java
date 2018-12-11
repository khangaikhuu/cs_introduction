import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class qboxbot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class qboxbot extends Actor
{
    public void act() 
    {
        Actor a = this.getOneIntersectingObject(Mario.class);
        if (a != null){
            getWorld().addObject(new abox(), getX(), getY() - 20);
            getWorld().removeObject(this);
        }
    }    
}

