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
        super(600, 300, 1);
        //Create Monkey object
        Monkey monkey = new Monkey();
        // add <omkey to the world
        addObject(monkey, 100, getHeight()/2);
        
        //Create Monkey1 object
        Monkey1 monkey1 = new Monkey1();
        // add monkey to the world
        addObject(monkey1, 200, getHeight()/2);
        
        //Create Monkey2 object
        Monkey2 monkey2 = new Monkey2();
        // add monkey to the world
        addObject(monkey2, 300, getHeight()/2);
        
        //Create Monkey3 object
        Monkey3 monkey3 = new Monkey3();
        // add monkey to the world
        addObject(monkey3, 400, getHeight()/2);
        
        //Create Monkey4 object
        Monkey4 monkey4 = new Monkey4();
        // add monkey to the world
        addObject(monkey4, 500, getHeight()/2);
        
        //Create Panda object
        Panda panda = new Panda();
        // add panda to the world
        addObject(panda, 50, getHeight()/2);
        
        //Create Panda1 object
        Panda1 panda1 = new Panda1();
        // add panda1 to the world
        addObject(panda1, 150, getHeight()/2);
        
        //Create Panda2 object
        Panda2 panda2 = new Panda2();
        // add panda2 to the world
        addObject(panda2, 250, getHeight()/2);
        
        //Create Panda3 object
        Panda3 panda3 = new Panda3();
        // add panda3 to the world
        addObject(panda3, 350, getHeight()/2);
        
        //Create Panda4 object
        Panda4 panda4 = new Panda4();
        // add panda3 to the world
        addObject(panda4, 450, getHeight()/2);
        
        
        
    }
}
