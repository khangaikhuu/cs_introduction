import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ptica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{

    double dy=0;
    double g=1.3;
    double boost_speed=-8;
    int c = 1;
    Counter counter;
    public int timer = 0;
    public void act() 
    {
        timer++;
        c++;
        if(c<=30){
            if(c%10==0){
                setImage("flappybird" + c/10 + ".png");
            }
            
        }
        else{
            c=1;
        }
        setLocation(getX(), (int)(getY() + dy));
        if (getOneIntersectingObject(Pipe.class) != null) {
            gameover gameOver = new gameover();
            getWorld().addObject(gameOver, getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        if (Greenfoot.isKeyDown("space"))
        {
            dy= boost_speed;

        }
        
        
        if (getY() == getWorld().getHeight()-1)
        {
            gameover gameOver = new gameover();
            getWorld().addObject(gameOver, getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        dy= dy + g;
    }    
}
