
/**
 * Write a description of class Week17WExercise2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week17WExercise2
{
    public void ratio(int[] array){
        double positive = 0;
        double negative = 0;
        double zero = 0;
        double total = array.length;
        for (int i = 0; i < array.length; i ++){
            if (array[i] > 0){
                positive = positive + 1;
            }
            if (array[i] < 0){
                negative = negative + 1;
            }
            if (array[i] == 0){
                zero = zero + 1;
            }
        }
        double pr = positive / total;
        double nr = negative / total;
        double zr = zero / total;
        System.out.println(pr);
        System.out.println(nr);
        System.out.println(zr);
   }
}
