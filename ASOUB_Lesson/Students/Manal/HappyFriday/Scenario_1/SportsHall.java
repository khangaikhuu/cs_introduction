import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SportsHall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SportsHall extends World
{
    public SportsHall()
    {    
        super(800, 500, 1); 
        Ball ball = new Ball();
        addObject(ball, 300, 400);
    }
}
