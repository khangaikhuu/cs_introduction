
/**
 * Write a description of class Excersice4 here.
 *
 * @author (Namuun)
 * @version (Monday)
 */
public class Excersice4
{
    int a = -1;
    int b = 10;
    int c = 4;
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

