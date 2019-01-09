import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tail extends Actor
{
    private int age = 0;
    private int lifeSpan;
    
    public Tail(int lifeSpan)
    {
        this.lifeSpan = lifeSpan;
    }
    public void act() 
    {
        rotate();
        if (age == lifeSpan) {
            getWorld().removeObject(this);
        }
        age++;
    }
    
    private void rotate()
    {
        if (Greenfoot.isKeyDown("right")) {
            setRotation(90);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("left")) {
            setRotation(270);
        }
        if (Greenfoot.isKeyDown("up")) {
            setRotation(0);
        }
    }
}
