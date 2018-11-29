
/**
 * Assigment 2
 *
 * @author (Manal)
 * @version (Wednesday week 1)
 */
public class Assigment_2
{
   public void exercise1(String yourName)
   {
       System.out.println("Hello");
       System.out.println(yourName);
   }
   public int exercise2(int a, int b)
   {
       return a - b;
   }
   
   public int exercise3(int x, int z)
   {
       return x / z;
   }
   
   public void exercise4(String myName)
   {
      for (int i = 0; i <= 15; i++){
          System.out.println(myName);
      }
   }
  
   public void exercise5(int age)
   {
       int myAge = 14;
       
       if (age > myAge){
           System.out.println("I'm not too old, GOSSSH");
       }
       else if (age < myAge){
           System.out.println("I'm not too young, ARRRR");
       }
       else{
           System.out.println("HURAYYY");
       }
   }
   
}
