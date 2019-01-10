
/**
 * Write a description of class Week17WExercise1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week17WExercise1
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
    
    public void secondMax(int[] array){
        selectionSort(array);
        int a = array[array.length - 2];
        if (a % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
