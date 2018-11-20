import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Namuun) 
 * @version (Week 11, Wednesday November 7)
 */
public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super (300, 224, 1); 
        
        Fam fam = new Fam ();
        addObject (fam, 50, 190);
        
        FamBoi boy = new FamBoi ();
        addObject (boy, 100, 190);
        
        FamGorl girl = new FamGorl ();
        addObject (girl, 140, 190);
        
        FamMom mom = new FamMom ();
        addObject (mom, 190, 190);
    }
}

