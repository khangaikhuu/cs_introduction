
/**
 * Write a description of class SecondLargest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SecondLargest
{
    public static void main(String[] args)
    {
	int arr[] = {5,2,1,6,3,4};
	int largest = arr[0];
	int secondLargest = arr[0];
	System.out.println("The given array is:" );
	for (int i = 0; i < arr.length; i++) 
	{
		System.out.print(arr[i]+"\t");
	}
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] > largest) 
		{
		        secondLargest = largest;
			largest = arr[i];
 
		} else if (arr[i] > secondLargest) 
		{
			secondLargest = arr[i];
 
		}
	}
	System.out.println("\nSecond largest number is:" + secondLargest);
	}
}
