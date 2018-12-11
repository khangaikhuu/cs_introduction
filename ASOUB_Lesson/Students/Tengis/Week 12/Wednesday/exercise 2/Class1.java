public class Class1
{
    int [] array1 = new int [5];
   
    public int [] Hi(int[] arr1)
    {
        for (int i = 0; i < arr1.length; i++)
        {
            array1[i] = arr1[i] * 5;
        }
        return array1;
    }
    
}