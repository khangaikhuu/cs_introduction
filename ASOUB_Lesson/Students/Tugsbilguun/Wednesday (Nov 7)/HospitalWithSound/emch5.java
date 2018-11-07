import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class emch5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class emch5 extends Actor
{
    /**
     * Act - do whatever the emch5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = getImage();
        image.scale(70,100);
        setImage(image);
    }    
}
