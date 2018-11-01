import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Snake lives in a world of 20 by 20 squares.
 * 
 * @author (Antosh) 
 * @version (Week10)
 */
public class SnakeWorld extends World
{

    public SnakeWorld()
    {    
        super(300, 200, 1); //super(600,400,1);
        GreenfootImage img = new GreenfootImage(20,20);
        img.drawRect(0,0,19,19);
        setBackground(img);
        Snake snake = new Snake();
        addObject (snake,200,100);
        Food food = new Food();
        addObject (food,100,100);
    }
}
