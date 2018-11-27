
/**
 * Write a description of class FindMaximum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FindMaximum
{
    private int a= 10,b=5,c=18;
    public int findMaximum ()
    {
        if (a>b && a>c) { 
            return a;
        }
        else if (b>a && b>c) {
            return b;
        }
        else 
        {
            return c;
        }
    }
    
}
