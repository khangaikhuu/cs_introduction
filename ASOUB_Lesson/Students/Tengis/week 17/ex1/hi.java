
/**
 * Write a description of class hi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hi
{
   int [] a = {1,2,3,4,5,6,7,89,5};
    public int[] hi(){
          
    for(int i = 0; i < a.length / 2; i++)
    {
        int temp = a[i];
        a[i] = a[a.length - i - 1];
        a[a.length - i - 1] = temp;
    }
    return a;

}
}
