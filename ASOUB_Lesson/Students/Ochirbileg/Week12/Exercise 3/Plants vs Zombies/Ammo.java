import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ammo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
  public class Ammo extends Plant1
  {
    /**
     * Act - do whatever the Ammo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        setLocation(getX() + speed, getY());
    }
    private int speed = 10;
  }   

