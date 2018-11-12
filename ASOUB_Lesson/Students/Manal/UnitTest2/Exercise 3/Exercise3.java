
/**
 * Write a description of class Exercise3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise3
{
    private int[] array = {34, 15, 78, 72, 3567, 121, 8672, 2354};
    int max = array[0];
    public void findMax(){
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
