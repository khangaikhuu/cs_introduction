
/**
 * Write a description of class multiply here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class multiply
{
   int[][] a = {{12,3,4},{4,5,6},{1,2,3}};
   int[][] b = {{3,4,5},{7,-1,0},{5,6,11}};
   int[][] c = new int[3][3];
   private int i,j;
   public int[][] multiplyMatrix(){
       for (int i=0;i<a.length;i++){
           for (int j=0;j<b.length;j++){
               c[i][j]=0;
           }
       }
       for (int i=0;i<a.length;i++){
           for (int j=0;j<b.length;j++){
               c[i][j]+= a[i][j]*b[j][i];
           }
       }
       return c;
   }
   
}
