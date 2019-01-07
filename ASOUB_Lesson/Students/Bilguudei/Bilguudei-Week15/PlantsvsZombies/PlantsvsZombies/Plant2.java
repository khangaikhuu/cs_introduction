import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plant2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plant2 extends Actor
{
    /**
     * Act - do whatever the Plant2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    } 
    public void shoot(){
        
        getWorld().addObject(new shoot(), getX(), getY());
        
    }
    public void movePlayer()
    {
        if(Greenfoot.isKeyDown("up")) {
            int ypos = getY() - 5; // ypos gets bigger which moves player up
            setLocation(getX(), ypos);
        }
        
        if(Greenfoot.isKeyDown("down")) {
            int ypos = getY() + 5; // ypos gets smaller which moves player down
            setLocation(getX(), ypos);
        }
        
        if(Greenfoot.isKeyDown("space")) {
            shoot();
            setImage("Plant2-fire.png");
        } else {
            setImage("Plant2.png");
        }
        
    }
}
