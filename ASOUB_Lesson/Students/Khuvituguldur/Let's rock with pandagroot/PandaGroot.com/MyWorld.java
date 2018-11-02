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
        super(800, 600, 1);
        //create PandaFish object
        PandaFish panda = new PandaFish();
        // add Pandafish to the world
        addObject(panda, 100, getHeight()/2);
    }
}
