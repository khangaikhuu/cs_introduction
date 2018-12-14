import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plant1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plant1 extends Plants
{
    /**
     * Act - do whatever the Plant1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (Greenfoot.isKeyDown("space")) {
             shoot();
         }
    }  
     public void shoot()
    {
        getWorld() .addObject(new Ammo(), getX(), getY());
    }
}
