
/**
 * Write a description of class ArrayEvenOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayEvenOdd
{
  int[] array = {1,2,5,6,3,2};
  public void evenOrOdd(){
      for (int a=0; a<array.length; a++){
          if (array[a] % 2 == 0){
            System.out.println("Even - " + array[a]);
        }
          else{
            System.out.println("Odd - "+ array[a]);
        }
      }
  }
}
