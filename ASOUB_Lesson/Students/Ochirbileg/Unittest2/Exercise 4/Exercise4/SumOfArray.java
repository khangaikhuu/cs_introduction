
/**
 * Write a description of class SumOfArray here.
 *
 * @author (Antosh)
 * @version (Week12)
 */
public class SumOfArray
{ 
    public static void main(String[] args)
    {
       int[] numbers = new int[]{43, 12, 23, 43, 11, -1, 0, 12, 34, 12, 23};
       int sum = 0;
       for(int i=0; i < numbers.length ; i++)
       sum = sum + numbers[i];
       double average = sum / numbers.length;
       System.out.println("Average value of the array element is :"+average);
    }
}
