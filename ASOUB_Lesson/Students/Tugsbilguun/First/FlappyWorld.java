import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends MyWorld
{

    /**
     * Constructor for objects of class FlappyWorld.
     * 
     */
    public FlappyWorld(){
        //create a flappy world object
        FlappyChild flappy = new FlappyChild();
        //add flappy bird to the world
        addObject(flappy, 80,getHeight()/2);
    }
}
