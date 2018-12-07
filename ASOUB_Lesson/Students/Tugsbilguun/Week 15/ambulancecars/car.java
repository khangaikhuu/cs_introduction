import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Actor
{
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int dx=4;
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image = getImage();
        image.scale(100,70);
        setImage(image);
        setLocation((int) (getX()-dx), (int)(getY()));
        Greenfoot.playSound("siren.wav");
    }    
}
