import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mashin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mashin extends Actor
{
    /**
     * Act - do whatever the mashin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int dx=3;
    public void act() 
    {
        GreenfootImage image = getImage();
        image.scale(100,70);
        setImage(image);
        setLocation((int) (getX()+dx), (int)(getY()));
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("siren.wav");
        }
    }    
}
