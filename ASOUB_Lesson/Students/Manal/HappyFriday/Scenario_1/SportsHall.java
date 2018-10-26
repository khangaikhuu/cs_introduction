import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SportsHall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SportsHall extends World
{

    /**
     * Constructor for objects of class SportsHall.
     * 
     */
    public SportsHall()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        Ball ball = new Ball();
        addObject(ball, 300, 400);
    }
}
