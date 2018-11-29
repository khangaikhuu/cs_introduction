import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mario extends Actor
{
    private int gravity = 1;
    private int velocity;
    public void act() 
    {
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX() + 5, getY());
        }
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX() - 5, getY());
        }
        fall();
        if (Greenfoot.isKeyDown("space")) jump();
    }
    public void fall(){
        setLocation(getX(), getY() + velocity);
        if (getY() > getWorld().getHeight() - 5) 
        {
            velocity = 0;
        }
        else 
        {
            velocity += gravity;
        }
        while(getOneIntersectingObject(null)!=null)
        {
            setLocation(getX() - 0, getY());
        }
        
    }
    public void jump(){
        velocity = -10;
    }
}