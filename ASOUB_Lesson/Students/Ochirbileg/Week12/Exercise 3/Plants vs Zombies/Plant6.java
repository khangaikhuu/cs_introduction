import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plant6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plant6 extends Plants
{
    private Actor collide;
    /**
     * Act - do whatever the Plant6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         destroy();
    }    
    public void destroy()
    {
        collide = getOneIntersectingObject(GodlyPower.class);
        if(collide != null){
            getWorld().removeObject(this);
        }
    } 
}    

