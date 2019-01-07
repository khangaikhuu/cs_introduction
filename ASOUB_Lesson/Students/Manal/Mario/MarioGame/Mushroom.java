import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mushroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mushroom extends Actor
{
    private int gravity = 1;
    private int velocity;
    public void act() 
    {
        fall();
        Actor b = this.getOneIntersectingObject(Mario.class);
        if (b != null){
            getWorld().removeObject(this);
        }
    }
    public void fall(){
        setLocation(getX(), getY() + velocity);
        Actor a = this.getOneIntersectingObject(Border.class);
        if (getY() > getWorld().getHeight() - 5) 
        {
            velocity = 0;
        }
        else if (a != null)
        {
            velocity = 0;
        }
        else 
        {
            velocity += gravity;
        }
    }
    
    public void jump(){
        velocity = -10;
    }    
}
