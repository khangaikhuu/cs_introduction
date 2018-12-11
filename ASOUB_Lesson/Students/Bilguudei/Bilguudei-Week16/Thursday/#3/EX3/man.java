import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class man extends Actor
{
    /**
     * Act - do whatever the man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = getImage();  
        image.scale(150, 100);
        setImage(image);
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("ILOVUEU.wav");
        }
    }    
}
