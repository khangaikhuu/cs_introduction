
/**
 * Write a description of class Week15Exercise3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week15Exercise3
{
    public void palindrome(int x){
        String pal = String.valueOf(x);
        System.out.println(pal.equals(new StringBuilder(pal).reverse().toString()));
    }
}
