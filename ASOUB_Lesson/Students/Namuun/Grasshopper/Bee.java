import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    public void act() 
    {
<<<<<<< HEAD
        
=======
        getImage().scale(150, 150);
        
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation (getX()-5, getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation (getX()+5, getY());
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation (getX(), getY()-5);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation (getX(), getY()+5);
        }
        Greenfoot.playSound("slurp.wav");
>>>>>>> cc622f30316d2518bc7e461034f85570abd14d2f
    }    
}
