import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends MyWorld
{

    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {
        //create animal object
        animal scorp = new animal();
        // add animal to the world
        addObject(scorp, 100, getHeight()/2);
    }
}
