
/**
 * Write a description of class GermanSide here.
 *
 * @author (Tug)
 * @version (2018)
 */
public class GermanSide
{
    private int numberofsoldiers;
    private int numberoftanks;
    private int numberofplanes;
    public GermanSide(){}
    public GermanSide(int a, int b, int c)
    {
        numberofsoldiers=a;
        numberoftanks=b;
        numberofplanes=c;
    }
    public int calculateAddition(int a,int b)
    {
        return a + b;
    }
    public int calculateSubtract(int a, int b)
    {
        return a - b;
    }
    public int calculateMultiply(int a, int b)
    {
        return a * b;
    }
    public int calculateDivision(int a, int b)
    {
        return a / b;
    }
    public void getGerman(int a,int b)
    {
        if(a > b)
        {
            System.out.println("HelloWorld");
        }
        else
        {
            System.out.println("WorldHello");
        }
    }
}
