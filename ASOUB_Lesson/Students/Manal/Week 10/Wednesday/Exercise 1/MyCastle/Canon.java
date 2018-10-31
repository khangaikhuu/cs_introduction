import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Canon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Canon extends Actor
{
    public void act() 
    {
        rotate();
    }
    
    private void rotate()
    {
        if (Greenfoot.isKeyDown("up")){
            setRotation(getRotation()-5);
        }
        if (Greenfoot.isKeyDown("down")){
            setRotation(getRotation()+5);
        }
    }
}
