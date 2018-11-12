
/**
 * Write a description of class Average here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Average
{
   public static void main(String[] args) {
        int[] arr = {3, 1, 10, 4, 1, -1};
        int total = 0;
           
        for(int i = 0; i < arr.length; i++){
        	total = total + arr[i];
        }
        int average = total / arr.length;
        System.out.format("The average is: %d", average + 10);
        
    }
   
}

