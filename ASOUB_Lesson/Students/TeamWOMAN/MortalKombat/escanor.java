import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class escanor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class escanor extends Actor
{
    /**
     * Act - do whatever the escanor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image = getImage();
        image.scale(100,150);
        setImage(image);
    }    
}
