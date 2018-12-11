
/**
 * Write a description of class BinarySearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearch
{
    public int recursiveBinarySearch(int[] sortedArray, int key, int low, int high){
        int middle = (low + high) / 2;
        
        if (high < low){
            return -1;
        }
        
        if (key == sortedArray[middle]){
            return middle;
        }
        else if (key < sortedArray[middle]){
            return recursiveBinarySearch(sortedArray, key, low , middle - 1);
        }
        else {
            return recursiveBinarySearch(sortedArray, key, middle + 1, high);
        }
    }
}
