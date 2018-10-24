import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    double dy = 0.0;
    double g = 1.0;
    double dx = 1.0;
    public void act() 
    {
        setLocation((int)(getX() + dx), (int)(getY() +dy));
        if (Greenfoot.isKeyDown("up") == true)
        {
            dy = -10;
        }
            dy = dy + g;
            setRotation(30);
    }    
}
