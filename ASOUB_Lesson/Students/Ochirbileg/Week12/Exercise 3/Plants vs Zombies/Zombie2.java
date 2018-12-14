import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zombie2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie2 extends Zombie
{
    private Actor collide;
    /**
     * Act - do whatever the Zombie2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setLocation(getX()-1, getY());
         destroy();
    }    
    public void destroy()
    {
        collide = getOneIntersectingObject(IceAmmo.class);
        if(collide != null){
            getWorld().removeObject(this);
        }
    } 
}    
