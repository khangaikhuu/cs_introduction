import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBear extends Actor
{
    int dy = 0;
    int g = 2;
    /**
     * Act - do whatever the FlappyBear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation (getX (), getY () + dy );
        dy = dy + g;
    }
}
