import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grizzly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grizzly extends Actor
{
    int dy = 1;
    int g = 2;
    /**
     * Act - do whatever the Grizzly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation( getX(), getY() + dy);
       dy = dy + g;
    }    
}
