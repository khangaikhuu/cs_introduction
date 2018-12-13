import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasketBallCompetition extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BasketBallCompetition()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        ball b = new ball();
        addObject(b, 400, 350);
        LebronJames LJ = new LebronJames();
        addObject(LJ, 300,300);
    }
}
