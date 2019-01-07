import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie3 extends Zombie
{
    private Actor collide;
    /**
     * Act - do whatever the Zombie3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         destroy();
    }    
    public void destroy()
    {
        collide = getOneIntersectingObject(Ammo.class);
        if(collide != null){
            getWorld().removeObject(this);
        }
    } 
}    

