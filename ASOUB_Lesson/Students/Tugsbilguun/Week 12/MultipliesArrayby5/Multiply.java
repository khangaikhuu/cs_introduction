
/**
 * Write a description of class Multiply here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multiply
{
    private int[] array = {1,2,3,4,7};
    private int[] array2 = new int[array.length];
    private int[] s = array2;
    public int[] multiplyArray(){
        for (int i = 0; i<array.length; i++){
            s[i] = array[i]*5;
        }
        return s;
    }
}
