import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1333, 695, 1); 
        CediOsman p1 = new CediOsman();
        addObject(p1, 750, 200);
        CollinSexton p2 = new CollinSexton();
        addObject (p2, 1000,350);
        Dunn p3 = new Dunn();
        addObject (p3, 370,350);
        JabariParker p4 = new JabariParker();
        addObject (p4, 600,200);
        Jr p5 = new Jr ();
        addObject (p5, 900,350);
        KevinLove p6 = new KevinLove();
        addObject (p6, 730,550);
        LauriMarkannen p7 = new LauriMarkannen();
        addObject (p7, 600,550);
        TristanT p8 = new TristanT ();
        addObject (p8, 720,370);
        WendellCarterJR p9 = new WendellCarterJR();
        addObject (p9, 600,380);
        ZachLavine p10 = new ZachLavine();
        addObject (p10, 450,350);
       
    }
}
