import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class star extends Actor
{
    int dx=5;
    public void act() 
    {
        GreenfootImage image = getImage();  
        image.scale(50, 50);
        setImage(image);
    
        if(Greenfoot.mouseClicked(this)){
            dx=dx+10;
            Greenfoot.playSound("slurp.wav");
            getWorld().addObject(new star(),310+dx,300);
            
            
        }  
        
    }
}
