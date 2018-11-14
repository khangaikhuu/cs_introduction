
/**
 * Write a description of class UnitTest3 here.
 *
 * @author ()
 * @version (a version number or a date)
 */
public class UnitTest3
{
    int [] array = {4, 1, 3, 2, 10, 5, 16, 17, 8, 10};
    
    public void subtraction ()
    {
        int subtraction = 8;
        
        for (int i = 0; i < array.length; i++)
        {
            subtraction = subtraction - array[i];
        }
        
        System.out.println (subtraction);
    }
}
