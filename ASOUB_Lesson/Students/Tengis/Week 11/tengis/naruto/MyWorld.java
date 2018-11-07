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
        super(986, 554, 1); 
        sakura a= new sakura();
        sasuke b = new sasuke();
        naruto c = new naruto();
        addObject(a, 100,200);
        addObject(b, 700,100);
        addObject(c, 200,200);
    }
}
