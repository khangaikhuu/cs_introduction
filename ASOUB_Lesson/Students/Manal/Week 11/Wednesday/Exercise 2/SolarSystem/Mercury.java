import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mercury here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mercury extends Actor
{
    /**
     * Act - do whatever the Mercury wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Mercury() 
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() / 10, img.getHeight() / 10);
        setImage(img);
    }    
}
