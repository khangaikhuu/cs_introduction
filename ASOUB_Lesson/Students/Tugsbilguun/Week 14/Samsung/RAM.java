import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RAM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RAM extends Actor
{
    /**
     * Act - do whatever the RAM wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image = getImage();
        image.scale(40,40);
        setImage(image);
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("RAM.wav");
        }
    }    
}
