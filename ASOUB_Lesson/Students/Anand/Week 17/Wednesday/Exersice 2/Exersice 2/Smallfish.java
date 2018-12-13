import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Smallfish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Smallfish extends Actor
{
    /**
     * Act - do whatever the Smallfish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(4);
        Actor a = this.getOneIntersectingObject(Bigfish.class);
        if (a != null){
            getWorld().removeObject(this);
            Greenfoot.playSound("full.wav");
        }
    }    
}
