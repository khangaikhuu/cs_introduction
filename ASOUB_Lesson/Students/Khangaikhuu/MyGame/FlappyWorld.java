import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyWorld here.
 * 
 * @author (Khangaikhuu) 
 * @version (Tuesday 2018.10.09)
 */
public class FlappyWorld extends MyWorld
{

    /**
     * Constructor for objects of class FlappyWorld.
     * 
     */
    public FlappyWorld()
    {
     
        // create a flappy bird object
        FlappyBird flappy = new FlappyBird();
        
        // add flappy bird to the world
        addObject(flappy, 100, getHeight()/5);
    }
}
