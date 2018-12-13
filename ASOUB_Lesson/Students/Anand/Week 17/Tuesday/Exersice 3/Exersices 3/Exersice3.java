import java.util.Scanner;
/**
 * Write a description of class Exersice3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exersice3
{
 static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Enter the radius: ");
      double radius = sc.nextDouble();
      double area = Math.PI * (radius * radius);
      System.out.println("The area of circle is: " + area);
 }
}
