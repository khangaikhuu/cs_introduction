import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ocean extends MyWorld
{

    /**
     * Constructor for objects of class Ocean.
     */
    public Ocean()
    {
        //Create a Whale object
        Whale dolphin = new Whale();
        // add Whale to the world
        addObject(dolphin, 100, getHeight()/2);
        
    }
}
