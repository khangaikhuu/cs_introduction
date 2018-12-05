
/**
 * Write a description of class Week15Exercise2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week15Exercise2
{
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
    public void thirdLargest(int[] array){
        selectionSort(array);
        System.out.println(array[array.length - 3]);
    }
}
