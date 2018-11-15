import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Write a description of class TwoArraytoOneArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoArraytoOneArray
{
    public static void main(String args[]) {
    String a[] = { "a", "b", "c" };
    String b[] = { "d", "e" };

    List<String> list = new ArrayList<String>(Arrays.asList(a));
    list.addAll(Arrays.asList(b));

    Object[] c = list.toArray();
    System.out.println(Arrays.toString(c));
  }
}
