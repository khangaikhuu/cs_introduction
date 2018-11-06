
/**
 * Write a description of class FiftyEight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FiftyEight
{
    int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int array1[][] = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
    int result[][] = new int[3][3];

    public void matrixMultiplier(){
        for (int i=0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                for (int k = 0; k < 3; k++){
                    result[i][j] += array[i][k] * array1[k][j];
                }
            }
        }
        for (int i = 0; i < result.length; i++)
        {
            for (int j = 0; j < 3; j++){
                System.out.println(result[i][j]);
            }
        }
    }
}
