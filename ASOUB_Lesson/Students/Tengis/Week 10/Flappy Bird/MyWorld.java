import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
int pipeCounter = 0;
int PIPE_SPACING = 150;
int score = 0;
int FIRST_PIPE = 240;
int flappyCounter = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        setPaintOrder(Pipe.class, bird.class, Game_Over.class);
        bird b = new bird ();
        addObject (b, 100, getHeight()/2);
    }
    public void act()
    {
        pipeCounter ++;
        
        if (pipeCounter % 100 == 0){
            createPipes();
            
        
    }
     if (pipeCounter >= FIRST_PIPE){   
    if (flappyCounter % 100 == 0)
    {
        score ++;
        System.out.println(score);
    }
            flappyCounter++;
            
        
    }
}
public void createPipes()
        {
            Pipe topPipe = new Pipe();
            Pipe botPipe = new Pipe ();
            GreenfootImage image = botPipe.getImage();
            addObject(botPipe, getWidth(),getHeight()/2+image.getHeight() );
            addObject(topPipe, getWidth(), botPipe.getY() - image.getHeight() - PIPE_SPACING);
        }
    }
   
