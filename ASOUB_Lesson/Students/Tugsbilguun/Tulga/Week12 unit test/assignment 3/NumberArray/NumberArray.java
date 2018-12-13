
/**
 * Write a description of class NumberArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberArray
{
    public int[] A = {1, 4, 2, 3, 5, 10, 7, 8, 11, 0, -1 };
    public boolean FindNumber (int a ) {
        for (int i=1; i<A.length; i++) {
			if (a== A [i]) 
			{
			    return true;
			 }
						
		}		
		return false;
    } 
}
