
/**
 * Write a description of class Exersice1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exersice1
{
    int[] aba = {1, 2, 4, 6};
    int[] ana = {5, 4, 2, 1};
    int[] sum = new int[4];
    public void main(){
        for (int i = 0; i < 4; i++){
            sum[i] = aba[i] + ana[i];
        }
        for (int i = 0; i < 4; i++){
            System.out.println(sum[i]);
        }
    }
}
