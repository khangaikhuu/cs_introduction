
/**
 * Write a description of class Hvldakfh here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tremarctos
{
   private int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
   private int[] arrays2 = new int[18];
   public int sumOfArrays()
   {
       int sum = 0;
       for ( int i = 0; i < arrays.length; i++)
       {
               sum = sum + arrays[i];            
       }
       return sum;
   }
   public double averageOfArrays(int[] arrays)
   {
       int sum = 0;
       for ( int i = 0; i < arrays.length; i++)
       {
               sum = sum + arrays[i];            
       }
       return sum / arrays.length;
       
   }
   public boolean getSpecificValue( int value, int[] arrays)
   {
        for( int i = 0; i < arrays.length; i++)
        {
              if ( value == arrays[i])
              {
                  return true;  
              }
        }
        return false;
   }
   public int findIndex(int element)
   {
         int index = -1;
         for(int i = 0; i < arrays.length; i++)
         {
             if (element == arrays[i])
             {
                index = i;
             }
         }
         return index;
   }
   
}
