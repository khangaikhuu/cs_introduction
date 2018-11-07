import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun extends Actor
{
    /**
     * Act - do whatever the Sun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Sun() 
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() / 10, img.getHeight() / 10);
        setImage(img);
    }    
}
