import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flappybird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flappybird extends Actor
{
    int dy = 1;
    int g = 2;
    
    public void act() 
    {
        setLocation( getX(), getY() + dy);
        dy = dy + g;
        setRotation(30);
    }    
}
