
/**
 * Assignment 2
 *
 * @author (Bilguudei)
 * @version (Wednesday Week1)
 */
public class Assignment2
{
    public void exerciseOne(String yourName)
    {
        System.out.println("Hello");
        System.out.println(yourName);     
   
    }
    public int exerciseTwo(int a, int b)
    {
        return a-b;
    }
    public void exerciseThree(int a, int b)
    {
        System.out.println(a/b);
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
        int myAge=18;
        if (age>myAge)
        {
            System.out.println("I'm not too old");
            
        }
        else if(age<myAge)
        {
            System.out.println("I.m not too young");
        }
        else
        {
            System.out.println("That is correct");
        }
    }
}
