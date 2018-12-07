public class lol
{
    private String a[][];
    public void something(int n)
    {
        a = new String[n][n];
        int row, col;
        for(row=n;row > 0; i--)
        {
            for (int j=0; j < n-i; j++)
            {
                a[i][j] = " ";
            }
            for(int k = n; k >= i; k--)
            {
                a[i][k] = "#";
            }
        }
        printArray();
    }
    
    public void printArray()
    {
        for (int i= 0; i < a.length-1; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                if (j == (a.length - 1))
                {
                    System.out.println("");
                }
                else
                {
                    System.out.print(a[i][j]);
                }
            }
        }
    }
}