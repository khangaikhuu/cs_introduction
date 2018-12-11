
/**
 * Write a description of class ArrayOdd here.
 *
 * @author (Namuun)
 * @version (a version number or a date)
 */
public class ArrayOdd
{
    int [] array = {1, 2, 3, 4, 5, 6};
    int even = 0, odd = 0;
    
    public void ArrayOdd ()
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 != 0)
            {
                System.out.println (array[i]);
            }
            else
            {
                
            }
        }
    }
} 
