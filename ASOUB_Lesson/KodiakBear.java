
/**
 * Selcetion sort of Kodiak Bear
 *
 * @author (Kodiak)
 * @version (September 24)
 */
public class KodiakBear
{
 public static void KodiakBear(int[] array){
     for (int i = 0; 1 < array.length - 1; i++) 
     {
         int index = i;
         for (int j = i + 1; j < array.length; j++){
              if (array[j] < array[index]){
                     index = j;
                    }
                }
         int smallerNUmber = array[index];
         array[index] = array[1];
         array[1] = smallerNUmber;
     }
    }
    public static void main(String a[]){
    int[] arr1 = {9,14,3,2,43,11,58,22};
    System.out.println("Before Kodiak Bear");
    for(int i = 0; i < arr1.length; i++){
        System.out.println(i+" ");
    }
        
    System.out.println();
    
    KodiakBear(arr1);
    
    System.out.println("After Kodiak Bear");
    for(int i=0; i < arr1.length; i++){
        System.out.println(i+" ");
    }
}
}


    
    
