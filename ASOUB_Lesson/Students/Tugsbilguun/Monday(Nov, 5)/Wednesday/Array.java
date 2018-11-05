
/**
 * Write a description of class Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array
{
    private int[] intarray={3, 4,5,6,1,15,7,3,23};
    public int biggestNumOfArray()
    {
        int max=0;
        for (int i = 0; i<intarray.length; i++){
            if(max<=intarray [i]){
                max=intarray[i];
            }
        }
        return max;
    }
}
