
/**
 * Write a description of class Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Panda
{
  public int number(String[] args)
  {
       int array[] = {1,2,3};
       int max = getMax(array);
       System.out.println("Maximum Value is: "+max);  
       return max;
  }
  
  public int getMax(int[] array)
  {
      int max = 0;
    for(int a = 0; a < array.length; a++)
    {
       if (array[a] >= max)
       {
            max = array[a];
        }
       
    }
    return max;
  }
}