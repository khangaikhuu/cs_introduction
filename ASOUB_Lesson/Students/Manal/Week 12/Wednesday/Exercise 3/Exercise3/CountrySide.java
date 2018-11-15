import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CountrySide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountrySide extends World
{

    /**
     * Constructor for objects of class CountrySide.
     * 
     */
    public CountrySide()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 480, 1); 
        Rabbit rabbit = new Rabbit();
        addObject(rabbit, 300, 400);
        Baby baby = new Baby();
    }
}
