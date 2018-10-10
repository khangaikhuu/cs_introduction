
/**
 * My first PrimitiveTypes in Java
 *
 * @author (Khangaikhuu)
 * @version (Tuesday)
 */
public class PrimitiveTypes
{
    int myNumber = 1;
    double myDoubleNumber = 2.6;
    float myFloatNumber = 3.4f;
    boolean isItTrueOrFalse = false;
    char myChar = 'a';
    String myString = "Hello World";
    long myLongNumber = 1123233232;
    short myShortNumber = 123;
    
    public int addTwoNumbers (int a, int b)
    {
        return a + b;
    }
    
    // please give me a 
    public String giveMeString (int x)
    {
        if (x > 100)
        {
            return "too High";
        }
        else if ( 50 <= x && x <= 100)
        {
            return "in Between";
        }
        else
        {
            return "too Low";
        }
    }
    
    public int sumOfNumber(int x)
    {
        // i save my sum in this variable
        int sum = 0;
        
        // calculate me the sum with loops
        for (int i = 1; i <= x; i++)
        {
            sum = sum + i;
        }
        
        // returning the sum of given number from 1 to x
        return sum;
    }
    
    public int sumOfNumberWithWhile(int x)
    {
        int sum = 0;
        int i = 1;
        while(i < x)
        {
            sum = sum + i;
            i = i + 1;
        }
        
        return sum;
    }
    
    private void printMyNameOut(String yourName)
    {
        System.out.println("My Name is : " + yourName);
    }
    
    
    protected void anotherPrint(String name)
    {
        printMyNameOut(name);
    }
}
