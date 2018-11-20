
/**
 * Write a description of class MaximumValue here.
 *
 * @author (Antosh)
 * @version (Week11)
 */
public class MaximumValue
{
      static int findMaximum(int arr[], int low, int high) 
    { 
       int max = arr[low]; 
       int i; 
       for (i = low; i <= high; i++) 
       { 
           if (arr[i] > max) 
              max = arr[i]; 
       } 
       return max; 
    } 
    public static void main (String[] args)  
    { 
        int arr[] = {4, 5, 4, 6, 10}; 
        int n = arr.length; 
        System.out.println("The maximum element is "+  
                            findMaximum(arr, 0, n-1)); 
    } 
}
