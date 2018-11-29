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
        Tanya tanya = new Tanya();
        allmight best = new allmight();
        armageddon arm = new armageddon();
        escanor escanor = new escanor();
        evilgoku goku = new evilgoku();
        naruto naruto = new naruto();
        roshi roshi = new roshi();
        sasuke sasuke = new sasuke();
        vegeta vegeta = new vegeta();
        
        addObject (tanya, 100, 300);
        addObject (best, 150, 300);
        addObject (arm, 200, 300);
        addObject (escanor, 275, 300);
        addObject (goku, 350, 300);
        addObject (naruto, 400, 300);
        addObject (roshi, 450, 300);
        addObject (sasuke, 500, 300);
        addObject (vegeta, 550, 300);
    }
}
