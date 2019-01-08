
/**
 * Write a description of class Number239 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class N239
{
    public static void main (String args [])
    {
        int marks [] = new int [4];
        int i;
        float total = 0, avg;
        Scanner scanner = new Scanner (System.in);
        
        for (i = 0; i < 4; i++)
        {
            System.out.println ("Enter Marks of Subject" + (i + 1) + ":");
            marks [i] = scanner.nextInt();
            total = total + marks [i];
        }
        scanner.close ();
        avg = total/4;
        System.out.println("The student grade is: ");
        if (avg >= 80)
        {
            System.out.print ("A");
        }
        else if (avg >= 60 && avg < 80)
        {
            System.out.print ("B");
        }
        else if (avg >= 40 && avg < 60)
        {
            System.out.print ("C");
        }
        else 
        {
            System.out.print ("D");
        }
    }
}