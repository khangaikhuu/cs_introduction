
/**
 * Write a description of class Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array
{
   private int[] array={-1, 2, 3, 4, 10, 0, 12, 15};
   public int averageOfArray(){
       int sum=0;
       for (int i=0; i<array.length; i++){
       sum = array[i]+array[i];
    }
        return sum/array.length;
   }
}
