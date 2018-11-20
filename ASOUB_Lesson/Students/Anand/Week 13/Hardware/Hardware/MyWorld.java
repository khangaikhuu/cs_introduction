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
        super(603, 750, 1); 
        Ram ram =  new Ram();
        addObject(ram, 500, 238);
        CPU cpu = new CPU();
        addObject(cpu, 333, 245);
        SSD ssd = new SSD();
        addObject(ssd, 380, 650);
        GPU1 gpu1 = new GPU1();
        GPU2 gpu2 = new GPU2();
        addObject(gpu1, 319, 460);
        addObject(gpu2, 319, 600);
        Bridge bridge = new Bridge();
        addObject(bridge, 150, 530);
        
    }
}
