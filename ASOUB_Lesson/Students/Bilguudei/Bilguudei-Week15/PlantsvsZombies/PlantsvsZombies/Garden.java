import greenfoot.*;  
public class Garden extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Garden()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        
    }
    
    
    
    
    
    
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(1000) < 20) {
            double randomY = Greenfoot.getRandomNumber(100);
            int maxX = getWidth();
            if (randomY > 75) {
                addObject(new Zombie1(), maxX, 200);
            } else if (randomY < 75 && randomY > 50) {
                addObject(new Zombie1(), maxX, 280);
            } else if (randomY < 50 && randomY > 25) {
                addObject(new Zombie1(), maxX, 340);
            }
        }
            
    }
}
