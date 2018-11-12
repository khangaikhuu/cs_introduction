
/**
 * Write a description of class FindMac here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FindMax{  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {4, 3, 1, 10, -1, 0, 15, 7};  
        selectionSort(arr1);
        System.out.println("Maximum is " + arr1[7]);
    }  
}  
