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
        super(650, 400, 1);
        emch1 e1 = new emch1();
        emch2 e2 = new emch2();
        emch3 e3 = new emch3();
        emch4 e4 = new emch4();
        emch5 e5 = new emch5();
        car mashin = new car();
        addObject(e1, getWidth()-100, getHeight()-50);
        addObject(e2, getWidth()-200, getHeight()-125);
        addObject(e3, getWidth()-300, getHeight()-200);
        addObject(e4, getWidth()-400, getHeight()-275);
        addObject(e5, getWidth()-500, getHeight()-350);
        addObject(mashin, getWidth()-500, getHeight()-50);
    }
}
