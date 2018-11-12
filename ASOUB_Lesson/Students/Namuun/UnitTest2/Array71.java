
/**
 * Write a description of class Array71 here.
 *
 * @author (Namuun)
 * @version (Week 11, Thursday Nov8)
 */
public class Array71
{
    int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
    public boolean findNumber (int a)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array [i] == a)
            {
                return true;
            }
        }
        return false;
    }
}
