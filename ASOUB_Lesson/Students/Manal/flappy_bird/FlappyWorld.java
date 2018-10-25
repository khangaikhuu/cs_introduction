import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flappyworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends World
{
    int pipeCounter = 0;
    int flappyCounter = 0;
    int PIPE_SPACING = 150;
    int score = 0;
    int FIRST_PIPE = 240;
    Score scoreObj = null;
    /**
     * Constructor for objects of class flappyworld.
     * 
     */
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600,400, 1, false);
        
        setPaintOrder(gameover.class, flappybird.class, Pipe.class);
        
        flappybird flappy = new flappybird();
        addObject(scoreObj, 100, 100);
    }
    
   public void act(){
        pipeCounter++;
        if (pipeCounter % 100 == 0){
            createPipes();
        }
        
        if (pipeCounter >= FIRST_PIPE){
            if (flappyCounter % 100 == 0){
                score++;
                scoreObj.setScore(score);
            }
            flappyCounter++;
        }
   }
   
   private void createPipes(){
       Pipe topPipe = new Pipe();
       Pipe botPipe = new Pipe();
       
       GreenfootImage image = botPipe.getImage();
   }
}
