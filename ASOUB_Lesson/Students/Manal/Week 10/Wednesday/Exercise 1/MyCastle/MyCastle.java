import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCastle extends World
{
    public MyCastle()
    {    
        super(600, 400, 1); 
        Canon canon = new Canon();
        addObject(canon, 300, 200);
    }
}
