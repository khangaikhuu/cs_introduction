
/**
 * Write a description of class Panda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Panda
{
    int[] intArray = {1,5, 7, 9, 10, 15, 20};
    
    public int[] getArray()
    {
       int[] temp = new int[intArray.length];
       for (int a = 0; a < intArray.length; a++)
       {
          temp[intArray.length -1-a] = intArray[a];
       }
       return temp;
    }
}
