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
        super(580, 638, 1);
        CPU cpu = new CPU();
        addObject(cpu, 460, 366);
        ram1 ram = new ram1();
        ram2 Ram2 = new ram2();
        ram3 Ram3 = new ram3();
        addObject(ram, 467, 276);
        addObject(Ram2, 545, 367);
        addObject(Ram3, 467, 460);
        HDD hdd = new HDD();
        addObject(hdd, 110, 150);
    }
}
