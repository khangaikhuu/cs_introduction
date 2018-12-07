import java.util.Scanner;
/**
 * Write a description of class Week15TExercise1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week15TExercise1
{
    public static void main(String[] args) 
    {
        int a;
        int n;
        int consecutiveCounter= 0;
        int consecutiveCounter1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            if (a == 1)
            {
                consecutiveCounter++;             
            }
            else
            {
                consecutiveCounter1 = consecutiveCounter;
            }
            n = n / 2;
        } 
        System.out.println(consecutiveCounter);
    }
}
