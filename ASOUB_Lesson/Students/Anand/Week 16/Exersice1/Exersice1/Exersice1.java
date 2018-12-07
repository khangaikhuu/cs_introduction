

/**
 * Write a description of class Exersice1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exersice1
{
    public void evenindex(int[] array){
        for (int i = 0; i < array.length; i++){
            if (i % 2 == 0){
                System.out.println("odd");
            }
            else {
                System.out.println(array[i]);
            }
        }
    }
}
