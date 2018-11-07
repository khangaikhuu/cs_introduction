import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class add_plz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class add_plz extends Actor
{
    /**
     * Act - do whatever the add_plz wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         GreenfootImage myImage = getImage();
      
        myImage.drawRect(5,5,100, 100);
        myImage.setColor(Color.RED);
 
    }    
    
    public void update()
    {
    }
}
