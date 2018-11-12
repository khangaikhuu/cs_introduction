
/**
 * Write a description of class SquareSum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SquareSum
{
    private int[] array = {3, 4, 5, 5, 1, 8, 10};
    
    public void sum(){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i] * array[i];
        }
        System.out.println(sum);
    }
}
