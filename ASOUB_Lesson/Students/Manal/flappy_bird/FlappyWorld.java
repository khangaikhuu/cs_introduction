import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyWorld here.
 * 
 * @author (Manal) 
 * @version (Tuesday 2018-10-09)
 */
public class FlappyWorld extends MyWorld
{
    public FlappyWorld()
    {
        flappybird flappy = new flappybird();
        
        addObject(flappy, 100 , getHeight()/2);
    }
}
