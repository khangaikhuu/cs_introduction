
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    public Fish(){
        setRotation(180);
         GreenfootImage image = getImage();
        image.scale(image.getWidth() - 400, image.getHeight() - 300);
        setImage(image);
        
    }
}
