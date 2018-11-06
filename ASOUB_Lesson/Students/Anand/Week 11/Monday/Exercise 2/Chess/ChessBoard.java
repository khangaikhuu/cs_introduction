import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChessBoard extends World
{

    /**
     * Constructor for objects of class MyWorld.
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
        WhiteRook t1 = new WhiteRook();
        WhiteRook t2 = new WhiteRook();
        addObject(r1, 0, 0);
        addObject(r2, 7, 0);
        addObject(t1, 0, 7);
        addObject(t2, 7, 7);
        BlackKnight k1 = new BlackKnight();
        BlackKnight k2 = new BlackKnight();
        WhiteKnight q1 = new WhiteKnight();
        WhiteKnight q2 = new WhiteKnight();
        addObject(k1, 1, 0);
        addObject(k2, 6, 0);
        addObject(q1, 1, 7);
        addObject(q2, 6, 7);
        BlackBishop e1 = new BlackBishop();
        BlackBishop e2 = new BlackBishop();
        WhiteBishop i1 = new WhiteBishop();
        WhiteBishop i2 = new WhiteBishop();
        addObject(e1, 2, 0);
        addObject(e2, 5, 0);
        addObject(i1, 5, 7);
        addObject(i2, 2, 7);
        BlackQueen a1 = new BlackQueen();
        BlackKing h1 = new BlackKing();
        WhiteQueen c1 = new WhiteQueen();
        WhiteKing o1 = new WhiteKing();
        addObject(a1, 3, 0);
        addObject(h1, 4, 0);
        addObject(c1, 4, 7);
        addObject(o1, 3, 7);
    }
}
    
