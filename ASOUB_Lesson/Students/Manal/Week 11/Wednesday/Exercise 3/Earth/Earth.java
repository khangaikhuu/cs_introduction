import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Earth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Earth extends Actor
{
    /**
     * Act - do whatever the Earth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Earth() 
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 3, image.getHeight() / 3);
        setImage(image);
    }    
}
