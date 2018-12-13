import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SF extends Actor
{
    private Actor collide;
    
    /**
     * Act - do whatever the SF wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setLocation(getX()+1, getY());
         destroy();
    }    
    public void destroy()
    {
        collide = getOneIntersectingObject(BF.class);
        if(collide != null){
            getWorld().removeObject(this);
        }
    } 
}
