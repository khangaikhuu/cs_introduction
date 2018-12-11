
/**
 * Write a description of class FandC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TempratureConveter
{
    public void Converter(float C)
    {
        float F = C * (9f / 5) + 32;
        System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");
    }
    public void Temprature(double F)
    {
         double C = (( 5 *(F - 32.0)) / 9.0);
         System.out.println(F + " degree Fahrenheit is equal to " + C + " in Celsius");
 
    }
}
