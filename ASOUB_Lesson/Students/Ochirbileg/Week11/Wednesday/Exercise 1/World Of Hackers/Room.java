import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room extends World
{

    /**
     * Constructor for objects of class Room.
     * 
     */
    public Room()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        Hacker1 hacker1 = new Hacker1();
        addObject (hacker1,370,350);
        Hacker2 hacker2 = new Hacker2();
        addObject (hacker2,150,350);
        Hacker3 hacker3 = new Hacker3();
        addObject (hacker3,600,350);
        Motto motto = new Motto();
        addObject (motto,500,100);
    }
}
