import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class REd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class REd extends MyWorld
{
    
    public REd()
    {
       //create Grizzly object
       Grizzly bear = new Grizzly();
       // add Grizzly to the world
       addObject(bear, 100, getHeight()/2);
    }
}
