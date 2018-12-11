
/**
 * Write a description of class HelloWorld here.
 * First helloworld program in Java
 * @author (Manal)
 * @version (Monday week 1)
 */
public class HelloWorld
{
   private int myVar;
   
   public HelloWorld()
   {
   }
   
   public HelloWorld(int a)
   {
       myVar = a;
    }
    public static int returnh(int x){
           return x;
    }
   
   
   public static void main(String[] args)
       { 
           System.out.println("Hello World");
           for (int i = 0; i < args.length; i++){
               System.out.println(args[i]);
           }
        }
}

