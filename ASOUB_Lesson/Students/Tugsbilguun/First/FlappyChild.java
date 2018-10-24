import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyChild here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyChild extends Actor
{
    double dy=0.2;
    double g=0.7;
    double dx=2;
    /**
     * Act - do whatever the FlappyChild wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation ((int)(getX() + dx),(int)( getY() + dy));
        
        if (Greenfoot.isKeyDown("up")== true)
        {
            dy = -7;
        }
       
        dy = dy + g;
    }    
}
