public class lol
{
    public void something(int n)
    {
        for(int i=0;i<n;i++)
        {
            for (int j=n-1; j > 0; j--)
            {
                System.out.print(" ");
                if (i == n -1 )
                {
                    System.out.print("#");
                }
            }
            
        }
    }
}