import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class COURT extends World
{

    /**
     * Constructor for objects of class OCEAN.
     * 
     */
    public OCEAN()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1);
        Ball whale=new Ball();
        addObject(BALL,300,300);
    }
}
