
/**
 * Write a description of class Subtract here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Subtract
{
    public void subtractArray(int[] b1, int[] b2)
    {
      int sub1 = 0;
      int sub2 = 0;
      for(int i = 0; i < b1.length; i++)
      {
          sub1 -= b1[i];
      }
      for(int k = 0; k < b2.length; k++)
      {
          sub2 -= b2[k];
      }
      System.out.println(sub1 - sub2);
      
    
    }
}
