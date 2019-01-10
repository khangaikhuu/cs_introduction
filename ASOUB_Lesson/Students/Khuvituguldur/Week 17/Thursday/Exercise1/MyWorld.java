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
        super(1000, 650, 1);
        //create Grasshopper object
        Grasshopper grasshopper= new Grasshopper();
        // add Bear to the world
        addObject(grasshopper, 100, getHeight()/2);
    }
}
