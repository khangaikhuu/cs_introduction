import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyChild here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyChild extends Actor
{
    int dy=2;
    int g=1;
    /**
     * Act - do whatever the FlappyChild wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation (getX(), getY() + dy);
      
    }    
}
