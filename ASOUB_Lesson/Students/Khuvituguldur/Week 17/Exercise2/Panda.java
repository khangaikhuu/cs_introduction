
/**
 * Write a description of class Panda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Panda
{
   int[] intArray = {1800, 1850, 1900, 1950, 2000};
   public boolean smile(int a)
   {
     boolean b = false;
     for(int c = 0; c < intArray.length; c++)
     {
        if (intArray[c] == a)
        {
             b = true;
             
        }
        
     }
     return b;
   }
}
