import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteChessPawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteChessPawn extends Actor
{
    /**
     * Act - do whatever the WhiteChessPawn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WhiteChessPawn() 
    {
        GreenfootImage image = getImage();
        image.scale(50,80);
        setImage(image);
    }    
}
