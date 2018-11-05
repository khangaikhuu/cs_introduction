
/**
 * Write a description of class Week11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week11
{
    public static void main(String[] args) 
    {
        int[] num = {69, 21, 8, 96, 78};
        int toFind = 69;
        boolean found = false;

        for (int n : num) 
       
        {
            if (n == toFind) 
            {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}


