import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FalppyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FalppyWorld extends MyWorld
{

    /**
     * Constructor for objects of class FalppyWorld.
     * 
     */
    public FalppyWorld()
    {
        FlappyBird flappy = new FlappyBird();
        
        addObject(flappy, 100, getHeight() -20);
    }
}
