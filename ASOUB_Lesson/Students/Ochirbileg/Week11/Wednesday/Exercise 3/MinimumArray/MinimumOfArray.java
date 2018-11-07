
/**
 * Write a description of class MinimumOfArray here.
 *
 * @author (Antosh)
 * @version (Week11)
 */
public class MinimumOfArray
{
    public static int getMinValue(int[] numbers){
  int minValue = numbers[0];
  for(int i=1;i<numbers.length;i++){
    if(numbers[i] < minValue){
	  minValue = numbers[i];
	}
  }
  return minValue;
}
}
