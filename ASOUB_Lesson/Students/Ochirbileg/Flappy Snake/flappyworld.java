import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flappyworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flappyworld extends MyWorld
{

    /**
     * Constructor for objects of class flappyworld.
     * 
     */
    public flappyworld()
    {
        // create a flappy snake object\
        FlappySnake flappy = new FlappySnake();
        
        // add flappy snake to the world
        addObject(flappy, 100, getHeight()/2);
    }
}
