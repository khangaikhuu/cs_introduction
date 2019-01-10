
/**
 * Write a description of class Panda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Panda
{
 public static void main(String[] args) {
 
		int arr[] = {12, 4, -1, 5, 12, 18, 29, 15, 19, 20, 21};
		int largest = arr[0];
		int secondLargest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
		if( secondLargest%2 == 0)
		{
		      System.out.println("Even");
		}
		else
		{
		    System.out.println("Odd");
		    
		}
		
 
	}
}
   
