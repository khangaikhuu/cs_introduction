import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Court here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Court extends MyWorld
{

    /**
     * Constructor for objects of class Court.
     * 
     */
    public Court()
    {
        Basketball ball = new Basketball ();
        addObject(ball, 400,400);
        LBJ lb = new LBJ ();
        addObject ( lb, 200,200);
    }
}
