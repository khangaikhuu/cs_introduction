import java.util.Scanner;
/**
 * Write a description of class Exersice1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exersice1
{
    public static void main(String args[])
    {
        double s1, s2, s3, s4, area; 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first side :"); 
        s1 = s.nextDouble();
        System.out.print("Enter the second side :"); 
        s2 = s.nextDouble();
        System.out.print("Enter the third side :"); 
        s3 = s.nextDouble();
        s4 = (s1 + s2 + s3 )/ 2 ;
        area = Math.sqrt(s4 * (s4 - s1) * (s4 - s2) * (s4 - s3));
        System.out.print("Area of Triangle is:"+area+" sq units");
    }
}


