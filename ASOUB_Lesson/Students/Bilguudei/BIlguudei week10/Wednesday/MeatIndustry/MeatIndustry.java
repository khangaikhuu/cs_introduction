import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MeatIndustry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeatIndustry extends World
{

    /**
     * Constructor for objects of class MeatIndustry.
     * 
     */
    public MeatIndustry()
    {    
        super(500, 400, 1);
        Cow COW=new Cow();
        addObject(COW,300,400);  
    }
}
