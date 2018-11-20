
/**
 * Write a description of class MultiplyArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplyArray
{
   private int[] array={4, 1, 2, 3, 4, 10, 12, 54, 34};
   public int multiplyArray(){
       int product=0;
       for (int i=0; i<array.length; i++){
           product=array[i]*array[i];
       }
       return product;
   }
}
