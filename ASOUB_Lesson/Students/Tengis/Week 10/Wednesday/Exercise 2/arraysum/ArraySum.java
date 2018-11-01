public class ArraySum
{
    public int  [] array1;
    public int [] array2;
    public void Method1(int [] array1, int [] array2)
    {
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i<array1.length;i++)
        {
            sum1 = sum1 + array1[i];
        }
         for (int i=0; i<array2.length;i++)
        {
            sum2 = sum2 + array1[i];
        }
        System.out.println (sum1 + sum2);
    }
}