import greenfoot.*; 
public class CPU extends Actor
{
    
        public void act() 
    {
        GreenfootImage image = getImage();  
        image.scale(100, 100);
        setImage(image);
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("CPU.wav");
        }
    }    
}
