import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class io here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class io extends Actor
{
    /**
     * Act - do whatever the io wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         GreenfootImage image = getImage();  
        image.scale(60, 60);      
        setImage(image);
        if (Greenfoot.mouseClicked(this)) {
        Greenfoot.playSound("fuck");}
    }    
}
