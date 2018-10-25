import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyDragon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyDragon extends Actor
{
    double dy = 0.0;
    double g = 1.0;
    double dx = 2.0;
    /**
     * Act - do whatever the FlappyDragon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation((int) (getX() + dx), (int)(getY() + dy));
        if (Greenfoot.isKeyDown("up") == true)
        {
            dy = -10;
        }
        dy = dy + g;
        setRotation(30);
        // Add your action code here.
    }    
}
