import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class board extends World
{

    public board()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(3, 3, 60); 
        setBackground("cell.jpg");
        
        
        
        GameBall cell_1=new GameBall();
        addObject(cell_1, 0, 0);
        GameBall cell_2=new GameBall();
        addObject(cell_2, 1, 0);
        GameBall cell_3=new GameBall();
        addObject(cell_3, 2, 0);
        GameBall cell_4=new GameBall();
        addObject(cell_4, 0, 1);
        GameBall cell_5=new GameBall();
        addObject(cell_5, 1, 1);
        GameBall cell_6=new GameBall();
        addObject(cell_6, 2, 1);
        GameBall cell_7=new GameBall();
        addObject(cell_7, 0, 2);
        GameBall cell_8=new GameBall();
        addObject(cell_8, 1, 2);
        GameBall cell_9=new GameBall();
        addObject(cell_9, 2, 2);
    }
    {
    }
}
