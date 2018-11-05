import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChessBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChessBoard extends World
{

    /**
     * Constructor for objects of class ChessBoard.
     * 
     */
    public ChessBoard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(8, 8, 50, false);
        GreenfootImage img = new GreenfootImage(50, 50);
        img.drawRect(0, 0, 50, 50);
        setBackground(img);
        
        BlackPawn p1 = new BlackPawn();
        BlackPawn p2 = new BlackPawn();
        BlackPawn p3 = new BlackPawn();
        BlackPawn p4 = new BlackPawn();
        BlackPawn p5 = new BlackPawn();
        BlackPawn p6 = new BlackPawn();
        BlackPawn p7 = new BlackPawn();
        BlackPawn p8 = new BlackPawn();
    }
}
