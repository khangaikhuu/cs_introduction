import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Swamp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Swamp extends Actor
{
    public Swamp()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 2, image.getHeight() / 2);
        setImage(image);
    }
}
