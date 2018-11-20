import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyWorld here.
 * 
 * @author (Namuun) 
 * @version (Tuesday October 9, 2018)
 */
public class FlappyWorld extends MyWorld
{

    /**
     * Constructor for objects of class FlappyWorld.
     * 
     */
    public FlappyWorld()
    {
        FlappyBear flappy = new FlappyBear();
        addObject(flappy, 100, getHeight()/2);
    }
}
