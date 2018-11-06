import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class emch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class emch extends Actor
{
    /**
     * Act - do whatever the emch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image = getImage();
        image.scale(70,100);
        setImage(image);
    }    
}
