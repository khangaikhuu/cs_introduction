import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SportsHall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SportsHall extends MyWorld
{

    /**
     * Constructor for objects of class SportsHall.
     * 
     */
    public SportsHall()
    {
        Ball ball = new Ball();
   
        addObject(ball, 300, 200);
    }
}
