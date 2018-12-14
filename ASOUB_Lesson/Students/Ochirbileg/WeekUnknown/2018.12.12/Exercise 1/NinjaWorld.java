import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NinjaWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NinjaWorld extends World
{
    private GreenfootSound backgroundSound;
    /**
     * Constructor for objects of class NinjaWorld.
     * 
     */
    public NinjaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Ninja1 ninja1 = new Ninja1();
        addObject(ninja1,200,50);
        Ninja2 ninja2 = new Ninja2();
        addObject(ninja2,300,150);
        Ninja3 ninja3 = new Ninja3();
        addObject(ninja3,500,100);
        Ninja4 ninja4 = new Ninja4();
        addObject(ninja4,400,250);
        backgroundSound = new GreenfootSound("Haah.wav");
        backgroundSound.playLoop();
        if (Greenfoot.mouseClicked(this))
        {
            backgroundSound.stop();
        }
    }
}
