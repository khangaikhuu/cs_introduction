
/**
 * Write a description of class Exersice1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exersice1
{
   public void multiplyarray(int[] array){
       int sum = 1;
       for (int i = 0; i< array.length; i++){
           sum = sum * array[i];
       }
       System.out.println(sum);
   }
}
