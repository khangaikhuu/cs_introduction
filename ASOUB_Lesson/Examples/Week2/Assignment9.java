
/**
 * Write a description of class Assignment9 here.
 *
 * @author (Ochirbileg)
 * @version (2018)
 */
public class Assignment9
{
    private boolean[] apple = {true,true,false,false,true,false,true,false,false};
    private String[] orange = {"A","B","C","D","E","F","G","H","I","J"};
    private int[] pear = {10,20,30,40,50,60,70,80,90,100};
    public int f(int x,int y,int z)
    {
        return x + y + z;
    }
    public void f(int x)
    {
        System.out.println(x);
    }
    public int f1(int a,int b,int c)
    {
        return a * b * c;
    }
    public int findMaximum(int a,int b)
    {
        if(a>b){
            return a;
        }
        else
        {
            return b;
        }
    }
}
