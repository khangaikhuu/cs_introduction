import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class basketball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class basketball extends Actor
{
   public void act() 
   {
      int dy = 0;
      int g = 2;        
      {
         setLocation (getX (), getY () + dy );
         dy = dy + g;
      }
   }    
}
