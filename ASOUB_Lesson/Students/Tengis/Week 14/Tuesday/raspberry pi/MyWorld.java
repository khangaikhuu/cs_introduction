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
        super(466, 300, 1); 
        box_AudioPort box1 = new box_AudioPort();
        box_HDMIport box2 = new box_HDMIport();
        box_LANport box3 = new box_LANport();
        box_SDport box4 = new box_SDport();
        box_USBport box5 = new box_USBport();
        box_proccesor box6 = new box_proccesor();
        box_ram_slot box7 = new box_ram_slot();
        line line = new line();
        line_dia line_dia = new line_dia();
        line_hor line_hor = new line_hor();
        line_tri line_tri = new line_tri();
        line_dia2 line_dia2 = new line_dia2();
        line_dia3 line_dia3 = new line_dia3();
        line_dia4 line_dia4 = new line_dia4();
        line_bit line_bit = new line_bit();
        addObject (box1,220,280);
        addObject (box2,100,280);
        addObject (box3,400,280);
        addObject(line_dia,375,240);
        addObject (box4,50,240);
        addObject(line_dia3,50,200);
        addObject (box5,400,50);
        addObject(line, 380,100);
        addObject(line_hor,400,90);
        addObject (box6,200,40);
        addObject (line_tri, 200, 90);
        addObject(line_dia2,220,240);
        addObject(line_bit,120,230);
        addObject (box7,100,40);
        addObject(line_dia4,80,80);
        
    }
}
