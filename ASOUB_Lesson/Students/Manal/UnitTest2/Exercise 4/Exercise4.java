
/**
 * Write a description of class Exercise4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise4
{
    int array[][] = {{1, 2, 3}, {-1, 2, 3}, {4, 3, 1}};
    int array1[][] = {{2, 3, 4},{1, 2, 3},{3, 1, 1}};
    int sub[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    
    public void subtract(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                sub[i][j] = array[i][j] - array1[i][j];
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(sub[i][j]);
            }
        }
    }
}
