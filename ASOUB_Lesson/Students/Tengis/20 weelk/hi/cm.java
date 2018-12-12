import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cm extends Actor
{
    /**
     * Act - do whatever the cm wants to do. This method is called whenever
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
