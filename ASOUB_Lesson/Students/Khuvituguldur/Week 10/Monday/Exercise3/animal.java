import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class animal extends Actor
{
    int dy =1;
    int g = 2;
    /**
     * Act - do whatever the animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation( getX(), getY() + dy);
       dy = dy + g;
    } 
    public class AnimalScorp extends Actor
    {
    double dy = 0.0;
    double g = 1.0;
    double dx = 2.0;
    /**
     * Act - do whatever the animal wants to do. This method is called whenver
     * the 'Act" or 'Run" button gets pressed in the environment.
     */
    public void act()
    {
        setLocation ((int ) ( getX() + dx), (int)(getY() + dy));
        dy = dy + g;
    
    }
    }    
}
