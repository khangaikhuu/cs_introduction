import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grizzly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grizzly extends Actor
{
    int dy = 1;
    int g = 2;
    /**
     * Act - do whatever the Grizzly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation( getX(), getY() + dy);
       dy = dy + g;
    }    

    public class GrizzlyBird extends Actor
    {
        double dy = 0.0;
        double g = 1.0;
        double dx = 2.0;
        /**
         * Act - dp whatever tje GrizzlyBird wants to do. This method is called whenver.
         * the 'Act' or 'Run' button gets pressed in the environemnt.
         */
         
        
        public void act()
        {
             setLocation ((int ) ( getX() + dx), (int)(getY() + dy));
             if (Greenfoot.isKeyDown("up") == true)
             {
                dy = 10;
             }
             dy = dy + g;

              
        } 
    }
}

