
/**
 * Write a description of class Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array
{
    private int[] intarray={3, 1, 2, 10, 5, 18, 2, 0, -1};
    public int minOfArray(){
         int min=-1;
         for (int i=0; i<intarray.length; i++){
             if (min>intarray[i]){
                 min=intarray[i];
             }
         }
         return min;
    }
}
