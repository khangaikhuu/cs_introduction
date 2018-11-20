import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hospital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hospital extends MyWorld
{

    /**
     * Constructor for objects of class Hospital.
     * 
     */
    public Hospital(){
        doctor emch = new doctor();
        addObject(emch, 300, 300);
    }
}
