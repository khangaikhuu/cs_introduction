import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bird extends Actor
{
    double dy = 0;
    double g = 1.3;
    double BOOST_SPEED = -15;
  
    
    public void act() 
    {
        
        if(getOneIntersectingObject(Pipe.class) !=null)
        {
            displayGameOver();
        }
        if (Greenfoot.isKeyDown("up") == true) 
        {
            dy = BOOST_SPEED;
           
        }
        
        
        if (getY() > getWorld().getHeight()){
            displayGameOver();
          
    }    
    dy = dy + g;
   
}
private void displayGameOver()
{
      Game_Over gameOver = new Game_Over ();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
          
}
 private void rotateFlappyBird()
    {
        if (dy <1)
        setRotation(30);
        
    }
}