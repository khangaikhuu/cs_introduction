import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    int dx = 8;
    int dy = 5;
    double e = 2.718;
    public void act() 
    {
        setLocation(0, 500);
        setLocation(getX() + dx, getY() + getypos(dx));
    }
    
    public double getypos(int x){
        return e ** x;
    }
}
