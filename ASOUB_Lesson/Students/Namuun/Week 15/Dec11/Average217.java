
/**
 * Write a description of class Average217 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Average217
{
    int [] Array = {1, 2, 3, 4, 5};
    
    public void Average ()
    {
        int sum = 0;
        for (int i = 0; i < Array.length; i++)
        {
            sum += Array[i];
        }
        System.out.println (sum/Array.length);
    }
}
