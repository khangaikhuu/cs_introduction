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
        super(1281, 719, 1); 
        dino1 a = new dino1();
        dino2 b = new dino2();
        dino3 c =new dino3();
        dino4 d =new dino4();
        dino5 e =new dino5();
        vulcan f = new vulcan();
        addObject (f,400,400);
        addObject (a, 400,600);
        addObject (b, 500,600);
        addObject (c, 600,600);
        addObject (d, 700,600);
        addObject (e, 800,600);
       
      
    }
}
