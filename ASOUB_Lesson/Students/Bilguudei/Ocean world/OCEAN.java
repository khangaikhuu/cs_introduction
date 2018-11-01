import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OCEAN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OCEAN extends World
{

    /**
     * Constructor for objects of class OCEAN.
     * 
     */
    public OCEAN()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        WHALE whale=new WHALE();
        addObject(whale,400,300);
    }
}
