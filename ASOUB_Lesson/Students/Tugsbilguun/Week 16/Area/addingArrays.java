
/**
 * Write a description of class addingArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class addingArrays
{
   private int[] a={1,2,3,4,5};
   private int[] b={2,0,4,9,10};
   private int[] c={1,2,3,8,1};
   private int[] d={-1,-2,8,9,10};
   private int[] e= new int [a.length];
   public int[] addArrays(){
       for (int q=0; q<a.length; q++){
           e[q]= a[q]+b[q]+c[q]+d[q];
       }
       return e;
   }
}
