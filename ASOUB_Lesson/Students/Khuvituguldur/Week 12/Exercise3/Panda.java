import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Panda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Panda extends Actor
{
    /**
     * Act - do whatever the Panda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Panda()
    {
          GreenfootImage image = getImage();
          image.scale(image.getWidth() - 10, image.getHeight() - 10);
          setImage(image);
    }
    // rest of class
    
}
