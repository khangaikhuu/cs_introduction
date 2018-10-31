
/**
 * Write a description of class Exercise3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise3
{
    public boolean isPrime(int x){
        if (x % 2 == 0){
            return false;
        }
        for (int i = 3; i*i<=x; i += 2){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}
