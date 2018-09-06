/**
 * Write a description of class primitivetypes here.
 * First primitive in Java
 * @author (Manal)
 * @version (Tuesday week 1)
 */
public class PrimitiveTypes
{
   int myNumber = 1;
   double myDoubleNumber = 2.6;
   float myFloatNumber = 3.4f;
   boolean isItTrueOrFalse = false;
   char myChar = 'a';
   String myString = "Hello World";
   long myLongNumber = 231231023;
   short myShortNumber = 123;
   
   public int addTwoNumbers (int a, int b)
   {
       return a + b;   
   }
   
   public float returnTwoFloatNumbers (float a, float b)
   {
       return a + b;
   }
   
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
   
   public int sumOfNumber (int x)
   {
       int sum = 0;
       
       for (int i = 1; i <= x; i++)
       {
           sum = sum + i;
       }
       
       return sum;
   }
   
   public int sumOfNumbersWithWhile (int x)
   {
       int sum = 0;
       int i = 1;
       while(i <= x)
       {
           sum = sum + i;
           i = i + 1;
       }
       
       return sum;
   }
   
   private void printMyNameOut(String yourName)
   {
       System.out.println("My name is : " + yourName);
   }
   
   protected void anotherPrint(String name)
   {
       printMyNameOut(name);
   }
}



