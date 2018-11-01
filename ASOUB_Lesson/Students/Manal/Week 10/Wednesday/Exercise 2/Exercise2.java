
/**
 * Write a description of class Exercise1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise2
{
    public void palindrome(String oriString)
    {
        StringBuilder ow = new StringBuilder(oriString);
        String reverseWord = new String(ow.reverse());
        
        if (oriString.toLowerCase().equals(reverseWord.toLowerCase())){
            System.out.println("The number is a palindrome");
        }
        else {
            System.out.println("The number is not a palindrome");
        }
    }
}
