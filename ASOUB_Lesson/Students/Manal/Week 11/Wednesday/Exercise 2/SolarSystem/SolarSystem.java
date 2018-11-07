import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SolarSystem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SolarSystem extends World
{

    /**
     * Constructor for objects of class SolarSystem.
     * 
     */
    public SolarSystem()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        GreenfootImage img = new GreenfootImage(1, 1);
        img.drawRect(0, 0, 1, 1);
        setBackground(img);
        
        Sun sun = new Sun();
        Mercury mercury = new Mercury();
        Venus v = new Venus();
        Earth e = new Earth();
        Mars m = new Mars();
        Jupiter j = new Jupiter();
        Saturn s = new Saturn();
        Neptune n = new Neptune();
        Pluto p = new Pluto();
        Uranus u = new Uranus();
        addObject(sun, 100, 200);
    }
}
