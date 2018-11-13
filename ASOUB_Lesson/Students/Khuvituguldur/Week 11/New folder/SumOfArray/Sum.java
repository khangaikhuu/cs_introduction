
/**
 * Write a description of class Sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sum
{
  public void addArray(int[] a1, int[] a2)
  {
    int sum1 = 0;
    int sum2 = 0;
    for(int i = 0; i < a1.length; i++)
    {
       sum1 += a1[i];
    }
    for(int e = 0; e < a2.length; e++)
    {
        sum2 += a2[e];
    }
    System.out.println(sum1 + sum2);
  }
}
