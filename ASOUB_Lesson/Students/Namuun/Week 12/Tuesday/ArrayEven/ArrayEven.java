
/**
 * Write a description of class ArrayEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayEven
{
    int [] array = {1, 2, 3, 4, 5};
    int [] array1 = {6, 7, 8, 9, 10};
    
    public void ArrayEven ()
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0)
            {
                System.out.println (array[i]);
            }
            if (array1[i] % 2 == 0)
            {
                System.out.println (array1[i]);
            }
        }
    }
}
