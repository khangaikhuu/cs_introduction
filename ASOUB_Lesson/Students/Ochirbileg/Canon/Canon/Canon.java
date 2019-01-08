import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Canon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Canon extends Actor
{
    /**
     * Act - do whatever the Canon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("space")) 
        {
             shoot();
        }
    }
    public void shoot()
    {
        getWorld() .addObject(new Canonball(), getX(), getY());
    }  
}
