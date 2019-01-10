
/**
 * Write a description of class N277 here.
 *
 * @author (Namuun)
 * @version (a version number or a date)
 */
public class N277
{
    public static void print2largest(int arr[], int arr_size) 
    { 
        int i, first, second; 
        
        first = second = Integer.MIN_VALUE; 
        for (i = 0; i < arr_size ; i++) 
        { 
            if (arr[i] > first) 
            { 
                second = first; 
                first = arr[i]; 
            } 
       
            else if (arr[i] > second && arr[i] != first) 
                second = arr[i]; 
        } 

        System.out.println("The second largest element"+" is "+ second);
        if (second % 2 == 0)
        {
            System.out.println ("The number is even");
        }
        else 
        {
            System.out.println ("The number is odd");
        }
    } 
    
    public static void main(String[] args)  
    { 
            int arr[] = {12, 35, 1, 10, 34, 1}; 
            int n = arr.length; 
            print2largest(arr, n); 
    }
}
