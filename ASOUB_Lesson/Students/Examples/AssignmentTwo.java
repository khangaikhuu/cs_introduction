
/**
 * Assignment 2
 *
 * @author (Khangaikhuu Uvgunkhuu)
 * @version (Wednesday Week-1)
 */
public class AssignmentTwo
{
    public void exerciseOne(String yourName)
    {
        System.out.println("Hello");
        System.out.println(yourName);
    }
    
    public int exerciseTwo(int a, int b)
    {
        return a - b;
    }
    
    public void exerciseThree(int a, int b)
    {
        System.out.println(a / b);
    }
    
    public void exerciseFour(String yourName)
    {
        for (int i = 0; i < 15; i++)
        {
            System.out.println(yourName);
        }
    }
    
    public void exerciseFive(int age)
    {
        int myAge = 36;
        if (age > myAge)
        {
            System.out.println("I’m not too old, GOSSSH");
        }
        else if(age < myAge)
        {
            System.out.println("I’m not too young, ARRRR");
        }
        else
        {
            System.out.println("HURRAYYY, You have successfully found out my age");
        }
        
    }
    
    
}
