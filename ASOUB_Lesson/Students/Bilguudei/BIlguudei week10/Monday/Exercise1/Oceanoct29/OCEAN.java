import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class OCEAN extends World
{

    /**
     * Constructor for objects of class OCEAN.
     * 
     */
    public OCEAN()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1);
        shark Shark=new shark();
        addObject(Shark,300,200);
    }
}