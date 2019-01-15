
/**
 * Write a description of class Assignment2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Assignment2
{
    public int [] array = {11,12,13,14,15,16,17,18,19,20};
    public boolean isPresent (int a){
        boolean isTrue = false;
        for (int i = 0; i< array.length; i++) {
            
            if (array [i] ==a ) 
            {
            isTrue= true;
            }
        }
    return isTrue;
    }
}
