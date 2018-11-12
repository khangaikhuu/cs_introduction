public class GetOverHereBuddy
{
    int [] b = {2, 3, 1, -1, -10, 1, 2, 3, 4, 6};
    int min = -10;
    public void hi()
    {
        for (int i = 0; i < b.length; i++)
        {
            if (min > b[i])
            {
                min = b[i];
            }
            
        }
        System.out.println(min);
    }
}
