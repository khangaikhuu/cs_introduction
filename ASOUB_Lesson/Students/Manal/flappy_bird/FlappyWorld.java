import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FlappyWorld extends World
{
    Counter counter=new Counter();
    FlappyBird flappy = new FlappyBird();
    int timer=0;
    public int x = 0;

    Pipe pippy = new Pipe(counter,flappy);
    GreenfootImage image =pippy.getImage();

    Pipe pippy2 = new Pipe(counter,flappy);
    GreenfootImage image1 =pippy2.getImage();

    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(counter,100,50);
        addObject(flappy, 50, 200);

        addObject(pippy, getWidth(), getHeight()/3*2 + 420);
        pippy2.turn(180);
        addObject(pippy2, getWidth(),  image.getHeight()/8);
    }

    public void act(){
        timer++;
        if(timer == 100){
            

            Pipe pippy = new Pipe(counter,flappy);
            GreenfootImage image =pippy.getImage();

            
            addObject(flappy, 50, 200);

            addObject(pippy, getWidth(), getHeight()/3*2 + 420) ;
            
            Pipe pippy2 = new Pipe(counter,flappy);
            GreenfootImage image1 =pippy2.getImage();
            pippy2.turn(180);
            addObject(pippy2, getWidth(),  image.getHeight()/8);
          
        timer=0;
       }
    }
}
