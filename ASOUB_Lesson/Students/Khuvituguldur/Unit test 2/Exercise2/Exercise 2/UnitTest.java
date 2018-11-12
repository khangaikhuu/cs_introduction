
/**
 * Write a description of class UnitTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitTest
{
    public static int findMaxValue(int[] numbers)
    {
           int maxValue = numbers[0];
           for( int a = 0; a < numbers.length; a++)
           {
             if(numbers [a] > maxValue)
             {
                 maxValue = numbers[a];
             }
           }
           return maxValue;
    }
}
