import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeHead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeHead extends Actor
{
    private final int EAST = 0;
    private final int SOUTH = 90;
    private final int WEST = 180;
    private final int NORTH = 270;
    
    private final int SPEED = 7;
    private int counter = 0;
    
    private int foodEaten = 0;
    
    public SnakeHead()
    {
        setRotation( Greenfoot.getRandomNumber(4)*90 );
        
    }
    
    public void act() 
    {
        moveAround();
        if (isTouching(Food.class)) {
            removeTouching(Food.class);
            foodEaten++;
            SnakeWorld world = (SnakeWorld)getWorld();
            world.addFood();
        }
        
        GameOver gameover = new GameOver();
        
        if (isTouching(Tail.class)) {
            getWorld().addObject(gameover, 15, 10);
            Greenfoot.stop();
        }
    }
    
    private void moveAround()
    {
        counter++;
        if (counter==SPEED){
            getWorld().addObject(new Tail(foodEaten*SPEED), getX(), getY());
            move(1);
            counter = 0;
        }
        if (Greenfoot.isKeyDown("right")) {
            setRotation(EAST);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(SOUTH);
        }
        if (Greenfoot.isKeyDown("left")) {
            setRotation(WEST);
        }
        if (Greenfoot.isKeyDown("up")) {
            setRotation(NORTH);
        }
    }
}
