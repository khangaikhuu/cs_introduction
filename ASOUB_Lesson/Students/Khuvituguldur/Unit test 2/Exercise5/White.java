import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class White here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class White extends Panda
{
    /**
     * Act - do whatever the White wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (Greenfoot.mouseClicked(this)) {
        Greenfoot.playSound("slurp.wav");
    }        
    }    
}
