
/**
 * Write a description of class Arrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrays
{
   private int[] array1 = new int[7];
   private int[] array2 = new int[8];
   public void biggerArray(){
       if (array1.length>array2.length){
           System.out.println("First array is bigger");
       }
       else if (array1.length<array2.length){
           System.out.println("Second array is bigger");
       }
       else{
           System.out.println("The two arrays are equal");
       }
   }
}
