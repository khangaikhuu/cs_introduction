
/**
 * Write a description of class StairCase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StairCase
{
    // instance variables - replace the example below with your own
    public void printStairCase(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print(j < n - i? " " : "#");
            }
            System.out.println("");
        }
    }
}
