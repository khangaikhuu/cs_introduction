
/**
 * Write a description of class N255 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 import java.util.Scanner;
class N238
{
   public static int[] ReverseArray (int[] Array)
   {
       int [] Temp = new int [Array.length];
       for (int i = 0; i < Array.length; i ++)
       {
           Temp [Array.length - 1 - i] = Array[i];
       }
       return Temp;
   }
   
   public static void main(String args[])
   {
      int n, reverse = 0;
      
      System.out.println("Enter an Array to reverse");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      
      while(n != 0)
      {
          reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;
      }
       
      System.out.println("Reverse of the Array is " + reverse);
    }
 }