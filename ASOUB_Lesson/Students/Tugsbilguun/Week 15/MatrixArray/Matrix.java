
/**
 * Write a description of class Matrix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matrix
{
    int a [][] = {{1,1,1},{2,2,2},{3,3,3}};
    int b [][] = {{1,1,1},{2,2,2},{3,3,3}};
    int e [][] = new int [a.length][b.length];
    public int[][] addMatrix(){
        for (int c=0; c<a.length; c++){
            for (int d=0; d<b.length; d++){
                e[c][d] = a[c][d] + b[c][d];
            }
        }
        return e;
    }
}
