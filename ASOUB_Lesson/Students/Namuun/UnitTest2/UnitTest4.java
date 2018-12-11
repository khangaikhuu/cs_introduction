
/**
 * Write a description of class UnitTest4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnitTest4
{
    int a = 5;
    int b = 4;
    int c = 3;
    int min = 100000;
    
    public void min()
    {
        if (a <= b && a <= c)
        {
            min = a;
        }
        
        else if (b <= a && b <= c)
        {
            min = b;
        }
        else
        {
            min = c;
        }
        System.out.println(min);
    }
}
