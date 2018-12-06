import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flappybird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    double dy = 0.0;
    double g = 1.0;
    double BOOST_SPEED = -5;
    
    public void act() 
    {
        if (getOneIntersectingObject(Pipe.class) != null){
            displayGameOver();
        }
        
        rotateFlappyBird();
        setLocation( getX(), (int)(getY() + dy));
        
        if (Greenfoot.isKeyDown("space") == true){
            dy = BOOST_SPEED;
        }
        
        if (getY() > getWorld().getHeight()){
            System.out.println("Game Over");
            gameover gameOver = new gameover();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }

        dy = dy + g;
    }
    
    private void displayGameOver(){
        displayGameOver();
    }
    
    private void rotateFlappyBird(){
        if (dy < 1){
            setRotation(-30);
        }
    }
}
