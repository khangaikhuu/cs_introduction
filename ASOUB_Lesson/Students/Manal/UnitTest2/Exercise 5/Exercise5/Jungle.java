import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jungle extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Jungle()
    {    
        super(800, 450, 1); 
        Monkey m = new Monkey();
        addObject(m, 125, 200);
    }
}
