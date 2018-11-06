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
        WhitePawn w1 = new WhitePawn();
        WhitePawn w2 = new WhitePawn();
        WhitePawn w3 = new WhitePawn();
        WhitePawn w4 = new WhitePawn();
        WhitePawn w5 = new WhitePawn();
        WhitePawn w6 = new WhitePawn();
        WhitePawn w7 = new WhitePawn();
        WhitePawn w8 = new WhitePawn();
        addObject(p1, 0, 1);
        addObject(p2, 1, 1);
        addObject(p3, 2, 1);
        addObject(p4, 3, 1);
        addObject(p5, 4, 1);
        addObject(p6, 5, 1);
        addObject(p7, 6, 1);
        addObject(p8, 7, 1);
        addObject(w1, 0, 6);
        addObject(w2, 1, 6);
        addObject(w3, 2, 6);
        addObject(w4, 3, 6);
        addObject(w5, 4, 6);
        addObject(w6, 5, 6);
        addObject(w7, 6, 6);
        addObject(w8, 7, 6);
        BlackRook r1 = new BlackRook();
        BlackRook r2 = new BlackRook();
        WhiteRook r11 = new WhiteRook();
        WhiteRook r22 = new WhiteRook();
        addObject(r1, 0, 0);
        addObject(r2, 7, 0);
        addObject(r11, 0, 7);
        addObject(r22, 7, 7);
        BlackKnight k1 = new BlackKnight();
        BlackKnight k2 = new BlackKnight();
        WhiteKnight k11 = new WhiteKnight();
        WhiteKnight k22 = new WhiteKnight();
        addObject(k1, 1, 0);
        addObject(k2, 6, 0);
        addObject(k11, 1, 7);
        addObject(k22, 6, 7);
        BlackBishop b1 = new BlackBishop();
        BlackBishop b2 = new BlackBishop();
        WhiteBishop b11 = new WhiteBishop();
        WhiteBishop b22 = new WhiteBishop();
        addObject(b1, 2, 0);
        addObject(b2, 5, 0);
        addObject(b11, 2, 7);
        addObject(b22, 5, 7);
        BlackQueen q1 = new BlackQueen();
        WhiteQueen q2 = new WhiteQueen();
        addObject(q1, 3, 0);
        addObject(q2, 4, 7);
        BlackKing king1 = new BlackKing();
        WhiteKing king2 = new WhiteKing();
        addObject(king1, 4, 0);
        addObject(king2, 3, 7);
    }
}
