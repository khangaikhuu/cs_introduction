import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shoot extends Plant2
{
    /**
     * Act - do whatever the shoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(4);
        Actor enemy = getOneIntersectingObject(Zombie1.class);
        
        if(enemy != null) {
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
        } else if(getX() > getWorld().getWidth() -10) {
            getWorld().removeObject(this);
        }
    }    
}
