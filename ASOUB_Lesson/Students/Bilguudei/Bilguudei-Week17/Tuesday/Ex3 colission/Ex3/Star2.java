import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star2 extends Actor
{
    /**
     * Act - do whatever the Star2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image = getImage();  
        image.scale(50, 50);
        setImage(image);
        move(-2);
        if (this.getOneIntersectingObject(Star1.class) != null)
        {
            getWorld().removeObject(this);
        } 
    }    
}
