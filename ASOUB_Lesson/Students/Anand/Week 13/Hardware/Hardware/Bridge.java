import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bridge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bridge extends Actor
{
    public Bridge()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() - 20, img.getHeight() - 122);
        setImage(img);
    }
    
    /**
     * Act - do whatever the Bridge wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("Bridge.wav");
        }
    }    
}
