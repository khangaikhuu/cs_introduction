
/**
 * Write a description of class ARRAY here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ARRAY
{
   public int [] array = {1,2,3,4,5};
   public int [] getArray (){
       int [] temp=new int [array.length];
       for (int i= 0; i<array.length; i++) {
        temp [array.length-1-i]= array [i];  
        }
    return temp;
    }
}
