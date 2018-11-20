
/**
 * Write a description of class ChecksArrayNum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChecksArrayNum
{
    private int[] array={4, 1, 2, 10, 5, 6, 7, 11, 23};
    public void bigOrSmall(){
        if (array[3]>array[5]){
            System.out.println("3rd is bigger");
        }
        else if (array[3]<array[5]){
            System.out.println("5th is bigger");
        }
        else{
        System.out.println("They are equal");
        }
    }
    
}
