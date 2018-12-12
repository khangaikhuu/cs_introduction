
/**
 * Write a description of class Exercise1 here.
 *
 * @author (Khangaikhuu)
 * @version (Wednesday 2018.10.24)
 */
public class Exercise1
{
    private int[] arrays = {1, 2, 3, 4, 5, 6, 7};
    private int[] arrays2 = new int[10];
    public int sumOfArrays()
    {
        int sum = 0;
        for (int i=0; i < arrays.length; i++)
        {
            sum = sum + arrays[i];
        }
        return sum;
    }
    
    public int sumOfArrays(int[] arrays)
    {
        int sum = 0;
        for (int i=0; i < arrays.length; i++)
        {
            sum = sum + arrays[i];
        }
        return sum;
    }
    
    public double averageOfArrays(int[] arrays)
    {
        int sum = 0;
        for (int i=0; i < arrays.length; i++)
        {
            sum = sum + arrays[i];
        }
        return sum / arrays.length;
    }
    
    public boolean getSpecificValue(int value, int[] arrays)
    {
        for (int i = 0; i < arrays.length; i++)
        {
            if (value == arrays[i])
            {
                return true;
            }
        }
        return false;
    }
    
    public int findIndex(int element)
    {
        int index = -1;
        for (int i = 0; i < arrays.length; i++)
        {
            if (element == arrays[i])
            {
                index = i;
            }
        }
        return index;
    }
}
