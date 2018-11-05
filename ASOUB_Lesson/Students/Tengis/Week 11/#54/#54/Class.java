public class Class
{
    public void Reverse()
    {
        int n = 4;
        int arr[] = {1, 2, 4 , 5};
        
        
        
        int temp;
        int start = 0;
        int end = n-1;
        
        while(start < end)
            {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        for (int j = 0; j < n; j++)
            {
            System.out.println(arr[j]);
        }
    }
}







