import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lawn extends World
{

    /**
     * Constructor for objects of class Lawn.
     * 
     */
    public Lawn()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Dave dave = new Dave();
        addObject(dave,20,300);
        Plant1 plant1 = new Plant1();
        addObject(plant1,120,50);
        Plant2 plant2 = new Plant2();
        addObject(plant2,70,250);
        Plant3 plant3 = new Plant3();
        addObject(plant3,70,160);
        Plant4 plant4 = new Plant4();
        addObject(plant4,70,50);
        Plant5 plant5 = new Plant5();
        addObject(plant5,100,200);
        Plant6 plant6 = new Plant6();
        addObject(plant6,100,290);
        Plant7 plant7 = new Plant7();
        addObject(plant7,150,350);
        Zombie1 zombie1 = new Zombie1();
        addObject(zombie1,400,200);
        Zombie2 zombie2 = new Zombie2();
        addObject(zombie2,550,350);
        Zombie3 zombie3 = new Zombie3();
        addObject(zombie3,450,50);
        Zombie4 zombie4 = new Zombie4();
        addObject(zombie4,550,200);
    }
}
