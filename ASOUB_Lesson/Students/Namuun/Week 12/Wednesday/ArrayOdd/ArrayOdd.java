
/**
 * Write a description of class ArrayOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayOdd
{
    int [] array = {1, 2, 3, 4, 5, 6};
    int even = 0, odd = 0;
    
    public void ArrayOdd ()
    {
        for (i = 0; i < array.length; i++)
        {
            if (i % 2 == 0)
            {
                even += array [i];
            }
            else
            {
                odd += array [i];
            }
        }
    }
}
