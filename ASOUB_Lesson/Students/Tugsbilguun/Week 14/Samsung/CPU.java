import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CPU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CPU extends Actor
{
    /**
     * Act - do whatever the CPU wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("CPU.wav");
        
        } 
    }
}
