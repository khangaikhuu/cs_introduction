import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plant1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plant1 extends Actor
{
    /**
     * Act - do whatever the Plant1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        {
           GreenfootImage image = getImage();
           image.scale(image.getWidth() - 1000, image.getHeight() - 1000);
           setImage(image);
        }
    }    
}
