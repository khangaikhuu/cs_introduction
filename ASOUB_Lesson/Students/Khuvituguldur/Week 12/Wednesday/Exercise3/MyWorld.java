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
        super ( 600, 400, 1);
        //create Panda object
        Panda panda = new Panda();
        // add Panda to the world 
        addObject(panda, 50, getHeight()/2);
        
        
        
    }
}
