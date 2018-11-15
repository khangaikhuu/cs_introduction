
/**
 * Write a description of class Calculate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculate
{
    public int sum=0;
    public int sumOfArray (int[] array) {
        for ( int i=0; i < array.length; i++) {
            sum= sum+ array [i];
        }
        return sum; 
    }
}
