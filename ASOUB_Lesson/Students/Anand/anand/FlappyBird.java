import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    int dy = 2;
    int g = 2;
    
    public void act() 
    {
        setLocation( getX(), getY() +dy);
        dy = dy + g;
        setRotation(30);
    }    
}
