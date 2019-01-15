import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun extends Plant5
{
    /**
     * Act - do whatever the Sun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        if (Greenfoot.getRandomNumber(20)==1);
        {
             setRotation(Greenfoot.getRandomNumber(360));
        }
        
    }    
}
