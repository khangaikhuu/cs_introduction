
/**
 * Write a description of class Multiplication here.
 *
 * @author ()
 * @version (November 6 Week  Tuesday)
 */
public class Multiplication
{
    int [] array = {2, 3, 1, 4, 5, 1, 10, 8, 9, 23, 34};
    int multiplication = 1;
    public void product()
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            multiplication = multiplication * array[i];
        }
        System.out.println (multiplication);
    }
}
