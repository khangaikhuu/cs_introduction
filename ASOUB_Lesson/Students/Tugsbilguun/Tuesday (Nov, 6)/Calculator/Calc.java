
/**
 * Write a description of class Calc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calc
{
   private double x;
   private double y;
   private double e = 2.71828;
   public double multiplication(double x, double y){
       return x*y;
   }
   public double division(double x, double y){
       return x/y;
   }
   public double addition(double x, double y){
       return x+y;
   }
   public double subtraction(double x, double y){
       return x-y;
   }
   public double square(double x){
       return x*x;
   }
   public double cube(double x){
       return x*x*x;
   }
   public double percentage(double x, double y){
       return (x/y)*100;
   }
   public double powerOfE(double x){
       return Math.pow(e,x);
   }
}
