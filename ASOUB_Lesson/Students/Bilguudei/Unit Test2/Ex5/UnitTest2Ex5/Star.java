import greenfoot.*;  

public class Star extends Actor
{
    
    public void act() 
    {
        GreenfootImage image = getImage();  
        image.scale(50, 50);
        setImage(image);
        if(Greenfoot.mouseClicked(this)){
            setLocation(290,300);
        }
    }    
}
