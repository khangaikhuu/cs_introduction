import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class football here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class football extends Actor
{
    /**
     * Act - do whatever the football wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int pause = 2;
    public int dx = 10;
    public int dy = 10;
    public void act() 
    {
        GreenfootImage image = getImage();  
        image.scale(30, 30);         
        setImage(image);
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.playSound("mmm-3.wav");
            setLocation(getX() + dx, getY() + dy);
        }
    }    
}
