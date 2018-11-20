
/**
 * Write a description of class CalculateArray here.
 *
 * @author (Antosh)
 * @version (Week11)
 */
public class CalculateArray
{
   public static void main(String[] args) 
    {   
 
       int[] numbers = new int[]{1, 4, 5, 1, 6, 10, 34, 11, 23, 0};
       //calculate sum of all array elements
       int sum = 0;
       for(int i=0; i < numbers.length ; i++)
        sum = sum + numbers[i];
       //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average); 
    }
}
