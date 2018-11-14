import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby extends Actor
{

    public void act() 
    {
        // Add your action code here.
        
        GreenfootImage image = getImage();
        image.scale(100,70);
        setImage(image);
       
    }    
}
