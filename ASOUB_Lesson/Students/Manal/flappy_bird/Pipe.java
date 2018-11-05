import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pipe extends Actor
{
    FlappyBird flappyBird;
    Counter counter;
    public int timer = 0;
    public Pipe(Counter c,FlappyBird f)
    {
        counter=c;
        flappyBird=f;
    }
    int pipe_speed = -4;
    public void act() 
    {
        setLocation( getX() + pipe_speed, getY());

        if(getX()<=20)
            getWorld().removeObject(this);      
    }    
}

