
/**
 * Write a description of class Week15Exercise1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week15Exercise1
{
    public void dupval(int[] intArray){
        int[] array = new int[intArray.length];
        for (int i = 0; i < intArray.length - 1; i++){
            array[0] = intArray[0];
            if (intArray[i] == intArray[i + 1]){
                array[i] = intArray[i];
            }
        }
        for (int i = 0; i < intArray.length; i++){
            System.out.println(array[i]);
        }
    }
}
