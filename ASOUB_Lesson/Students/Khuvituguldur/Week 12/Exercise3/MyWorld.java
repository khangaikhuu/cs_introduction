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
        //create Panda object
        Panda panda = new Panda();
        // add Panda to the world 
        addObject(panda, 100, getheight()/2);;
        super(1000, 800, 1);
    }
}
