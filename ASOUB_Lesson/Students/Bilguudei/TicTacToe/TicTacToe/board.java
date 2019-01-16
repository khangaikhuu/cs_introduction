import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class board extends World
{
    Player player;
    /**
     * Constructor for objects of class board.
     * 
     */
    public board()
    {    
      
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(3, 3, 60);
        //adding paint order in board regarding to the Player, gameball classes
        setPaintOrder(Player.class, GameBall.class);
        // set background image to cell.jpg
        setBackground("cell.jpg");
        //creating new player
        player = new Player();
        //adding object to the world
        addObject(player, 0,0);
        //creating the tic tac toe cell_1
        GameBall cell_1 = new GameBall();
        // add cell1 at position x = 0, y = 0
        addObject(cell_1, 0, 0);
        //creating the tic tac toe cell_2
        GameBall cell_2 = new GameBall();
        // add cell2 at position x = 1, y = 0
        addObject(cell_2, 1, 0);
        //creating the tic tac toe cell_3
        GameBall cell_3 = new GameBall();
        // add cell3 at position x = 2, y = 0
        addObject(cell_3, 2, 0);
        //creating the tic tac toe cell_4
        GameBall cell_4 = new GameBall();
        // add cell4 at position x = 0, y = 1
        addObject(cell_4, 0, 1);
        //creating the tic tac toe cell_5
        GameBall cell_5 = new GameBall();
        // add cell5 at position x = 1, y = 1
        addObject(cell_5, 1, 1);
        //creating the tic tac toe cell_6
        GameBall cell_6 = new GameBall();
        // add cell6 at position x = 2, y = 1
        addObject(cell_6, 2, 1);
        //creating the tic tac toe cell_7
        GameBall cell_7 = new GameBall();
        // add cell7 at position x = 0, y = 2
        addObject(cell_7, 0, 2);
        //creating the tic tac toe cell_8
        GameBall cell_8 = new GameBall();
        // add cell8 at position x = 1, y = 2
        addObject(cell_8, 1, 2);
        //creating the tic tac toe cell_9
        GameBall cell_9 = new GameBall();
        // add cell9 at position x = 2, y = 2
        addObject(cell_9, 2, 2);
        
    }
}
