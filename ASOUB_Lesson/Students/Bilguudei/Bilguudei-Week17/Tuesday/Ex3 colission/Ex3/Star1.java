import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Star1 extends Actor
{
    /**
     * Act - do whatever the Star1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = getImage();  
        image.scale(50, 50);
        setImage(image);
        move(2);
        if (this.getOneIntersectingObject(Star2.class) != null)
        {
            getWorld().removeObject(this);
        } 
        
                
    }    
}
