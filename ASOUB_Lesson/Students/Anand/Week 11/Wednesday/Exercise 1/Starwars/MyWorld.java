import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Spaceship1 spaceship1 = new Spaceship1();
        Spaceship2 spaceship2 = new Spaceship2();
        Spaceship3 spaceship3 = new Spaceship3();
        Spaceship4 spaceship4 = new Spaceship4();
        Spaceship5 spaceship5 = new Spaceship5();
        addObject(spaceship1, 45, 300);
        addObject(spaceship2, 450, 300);
        addObject(spaceship3, 330, 300);
        addObject(spaceship4, 200, 300);
        addObject(spaceship5, 500, 300);
    }
}
