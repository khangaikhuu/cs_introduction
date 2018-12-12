import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eagle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eagle extends Actor
{
    /**
     * Act - do whatever the eagle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int i = 1;
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image = getImage();
        image.scale(100,70);
        setImage(image);
        
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("eagle.wav");
            if (i == 1)
            {
                changeImage(true);
                i = 0;
            }
            else
            {
                changeImage(false);
                i = 1;
            }
        }
    }    
    public void changeImage(boolean changeImage)
    {
        if (changeImage)
        {
            setImage(new GreenfootImage("Eagle.png"));
        }
        else
        {
            setImage(new GreenfootImage("eagle2.png"));
        }
        
        
        
    }
}
