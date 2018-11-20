
public class SelectionSort
{
   public static void selectionSort(int[] array){
       for(int i=0; i<array.length-1;i++)
       {
           int index=i;
           for(int j=i+1;j<array.length; j++){
               if(array[j]<array[index])
               {
                   index=j;
                }
            }
            int smallerNumber=array[index];
            array[index]=array[i];
            array[i]=smallerNumber;
        }
        
}
    public static void man(String a[]){
        int[] arr1={9,14,3,2,43,11,58,22};
        System.out.println("Before SelectionSort");
    for(int i=0; 1<arr1.length; i++){
           System.out.print(i+" ");
        }
        System.out.println();
        selectionSort(arr1);
        System.out.println("After Selection Sort");
        for(int i=0; i<arr1.length; i++){
            System.out.println(i+" ");
        }
    }
}
        
        
   
