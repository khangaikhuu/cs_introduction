import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeWorld extends World
{
    public SnakeWorld()
    {
        super(30, 20, 40, true);
        GreenfootImage img = new GreenfootImage(40, 40);
        img.drawRect(0, 0, 40, 40);
        setBackground(img);
        
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        addObject(new SnakeHead(), x, y);
        
        addFood();
    }
    
    public void addFood()
    {
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getWidth());
        addObject(new Food(), x, y);
    }
}