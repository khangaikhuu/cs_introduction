import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Panda2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Panda2 extends Monkey4
{
    /**
     * Act - do whatever the Panda2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = getImage();
        image.scale(70, 100);
        setImage(image);
    }    
}
