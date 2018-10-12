import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyChild here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyChild extends Actor
{
    double dy=2;
    double g=1;
    /**
     * Act - do whatever the FlappyChild wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation (getX(),(int)( getY() + dy));
        
        if (Greenfoot.isKeyDown("up")== true)
        {
            dy = -10;
        }
      
        dy = dy + g;
    }    
}
