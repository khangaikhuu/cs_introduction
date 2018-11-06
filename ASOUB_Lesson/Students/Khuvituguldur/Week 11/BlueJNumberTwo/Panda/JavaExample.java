
/**
 * Write a description of class Panda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JavaExample 
{
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 5, 6 , 7, 10, 2 };
        int total = 0;

        for(int i = 0; i < arr.length; i++){
        	total = total + arr[i];
        }
        int average = total / arr.length;
        System.out.format("The average is: %d", average);
    }
}
