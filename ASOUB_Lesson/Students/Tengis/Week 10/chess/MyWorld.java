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
        super(700,700, 1); 
        pawn a = new pawn ();
         addObject (a,90,540);
         pawn b = new pawn ();
         addObject (b,180,540);
         pawn c = new pawn ();
         addObject (c,270,540);
         pawn d = new pawn ();
         addObject (d,360,540);
         pawn e = new pawn ();
         addObject (e,450,540);
         pawn f = new pawn ();
         addObject (f,540,540);
    }
}
