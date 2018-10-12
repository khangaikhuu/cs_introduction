
/**
 * Write a description of class Containe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Container
{
        
   int[]  cont1 = {9,5,7,8,4};
   
   
   public int getSize()
   {
      return cont1.length;
   }
   private Apple[] apples = new Apple[3];
   public Container(Apple a1, Apple a2, Apple a3)
   { 
      apples[0] = a1;
      apples[1] = a2;
      apples[2] = a3;
   }  
   public Apple[]getApples()
   {
     return apples; 
   }
   
   
   
   
   
}
    
    
