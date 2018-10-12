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
<<<<<<< HEAD
    public class GrizzlyBird extends Actor
    {
        double dy = 0.0;
        double g = 1.0;
        /**
         * Act - dp whatever tje GrizzlyBird wants to do. This method is called whenver.
         * the 'Act' or 'Run' button gets pressed in the environemnt.
         */
         
        
        public void act()
        {
             setLocation( getX(), (int)(getY() + dy));
             if (Greenfoot.isKeyDown("up") == true)
             {
                dy = 10;
             }
             dy = dy + g;
             
        }
    }
=======
>>>>>>> 02c233f14fd4207b5e5817a6ba05137c1c5ee490
}
