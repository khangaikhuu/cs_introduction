import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public MyWorld(){
        super (600,400,1);
        emch emch = new emch();
        car mashin = new car();
        addObject(mashin, 200, 300);
        addObject(emch, 155, 125);
    }
}
