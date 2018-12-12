import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monkey1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monkey1 extends Actor
{
    /**
     * Act - do whatever the Monkey1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = getImage();
        image.scale(70, 100);
        setImage(image);
        
         if (Greenfoot.mouseClicked(this))
            Greenfoot.playSound("monkey.wav");
        setRotation(90);
         if (Greenfoot.isKeyDown("up"))
         { move(-4); }
         if (Greenfoot.isKeyDown("down"))
         { move(4); }
        setRotation(0);
    }    
}
