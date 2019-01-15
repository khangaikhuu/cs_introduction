import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Grasshopper extends Actor
{

    /**
     * Act - do whatever the Grasshopper wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       if( Greenfoot.isKeyDown("left"))
        {
             setLocation(getX()-3,getY());
             
 
        }
       if( Greenfoot.isKeyDown("right"))
        {
             setLocation(getX()+3,getY());
        
        }
         if( Greenfoot.isKeyDown("down"))
        {
             setLocation(getX(),getY()+3);
        
        }
         if( Greenfoot.isKeyDown("up"))
        {
             setLocation(getX(),getY()-3);
        
        }
        Greenfoot.playSound("au.wav");
    }
}
