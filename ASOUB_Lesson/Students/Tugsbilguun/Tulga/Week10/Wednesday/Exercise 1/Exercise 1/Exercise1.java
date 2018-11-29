
/**
 * Write a program, which 
 * calculates all elements of given array. {5, 4, 22, 34, 12} #39
 *
 * @author (Tulga)
 * @version (a version number or a date)
 */
public class Exercise1
{
    public int [] array= {5,4,22,34,12};
    public void printArraySum () 
    {
        int sum = 0;
        for (int i=0; i < array.length; i++) 
        {
            sum= sum+ array [i];
        }
        System.out.println (sum);
    }
}
