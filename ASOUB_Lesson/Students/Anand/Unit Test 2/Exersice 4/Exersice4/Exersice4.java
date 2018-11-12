
/**
 * Write a description of class Exersice4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exersice4
{
    static int arr[] = {1, 2, 10, 3, 4, -1, 6, 7, 15}; 
    static int sum() 
    { 
        int sum = 0; 
        int i; 
        
        
        for (i = 0; i < arr.length; i++) 
            sum += arr[i]; 
        
        return sum; 
    } 
    public static void main(String[] args) 
    { 
        System.out.println("Sum of given array is " + sum()); 
    } 
}
