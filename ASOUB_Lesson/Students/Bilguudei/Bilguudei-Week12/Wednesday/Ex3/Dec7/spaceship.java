import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class spaceship extends Actor
{
    public void act() 
    {
        GreenfootImage image = getImage();  
        image.scale(100, 100);
        setImage(image);
        if(Greenfoot.mouseClicked(this))
        {
            setLocation(300,150);
           }    
        }
}
