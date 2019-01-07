 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ninja1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ninja1 extends Actor
{
    private GreenfootSound speakSound;
    private int count1 = 0;
    private int count2 = 0;
    private int count3 = 0;
    /**
     * Act - do whatever the Ninja1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        {   
           if(count1 == 0)
           {
               move(4);
               count2 = count2 +1;
           }
           if(count2 == 20)
           {
               move(-4);
               count3 = count3 +1;
               count1 = 1;
           }
           if(count3 == 20)
           {
                count1 = 0;
                count2 = 0;
                count3 = 0;
           } 
        }
        speakSound = new GreenfootSound("Haah.wav");
        if(Greenfoot.mouseClicked(this))
        {
            speakSound = new GreenfootSound("Haah.wav");
        }
    }
}
