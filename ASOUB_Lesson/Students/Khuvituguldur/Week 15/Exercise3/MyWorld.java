import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        //Create a Ger object
        Ger ger = new Ger();
        // add Ger to the world
        addObject(ger, 100, getHeight()/2);
        
        //Create a Gar object
        Gar gar = new Gar();
        // add Gar to the world
        addObject(gar, 300, getHeight()/2);
        
        //Create a Gyr object
        Gyr gyr = new Gyr();
        // add Gyr to the world
        addObject(gyr, 500, getHeight()/2);
    }
    
}
