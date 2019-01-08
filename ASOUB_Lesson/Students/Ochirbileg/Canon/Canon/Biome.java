import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Biome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Biome extends World
{

    /**
     * Constructor for objects of class Biome.
     * 
     */
    public Biome()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Canon canon = new Canon();
        addObject(canon,100,300);
    }
}
