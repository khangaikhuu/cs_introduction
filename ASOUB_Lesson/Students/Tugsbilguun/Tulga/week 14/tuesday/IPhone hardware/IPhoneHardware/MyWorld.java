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
        super(800, 800, 1); 
        Ram ram = new Ram();
        addObject(ram, 490,370);
        BaseBandProcessor bbp = new BaseBandProcessor();
        addObject(bbp, 430,370);
        TouchController tc = new TouchController();
        addObject(tc, 300,300);
        cpu cpu = new cpu();
        addObject(cpu, 330,200);
        sim sim = new sim();
        addObject(sim, 200,300);
        
    }
}
