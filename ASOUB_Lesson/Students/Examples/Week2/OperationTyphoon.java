
/**
 * Write a description of class OperationTyphoon here.
 *
 * @author (Khangaikhuu)
 * @version (October 2)
 */
public class OperationTyphoon
{
    private boolean Antosh;
    private int Red;
    private String Ant055;
    
    private long Gan6;
    private char gang;
    private char gangs;
    
   
    public OperationTyphoon(boolean a, int b, String c){
        Antosh = a;
        Red = b;
        Ant055 = c;
    }
    public void setGangs (char c)
    {
        gangs = c;
    }
    public void setGang (char b)
    { 
        gang = b;
    }
    public void setGan6 (long a)
    {
         Gan6=a;
    }
    
    public void setAntosh (boolean a)
    {
        Antosh = a;
    }
    
    public void setRed (int b)
    {
        Red = b;
    }
    
    public void setAnt055 (String c)
    {
        Ant055 = c;
    }
    
    public long getGang6()
    {
        return Gan6;
    }
    public char getGang()
    {
        return gang;
    }
    public char getGangs()
    {
        return gangs;
    }
    public boolean reverseBool(){
        return !Antosh;
    }
    public boolean getAntosh()
    {
        return Antosh;
    }
    public int getRed()
    {
        return Red;
    }
    public String Ant055()
    {
        return Ant055;
    }
    public int okMok ( int a, int b, int c)
    {
        return (a^2 * b^2 * c^2 );
    }
    public int okMok1 ( int a, int b, int c)
    {
        return (a^2 + b^2 + c^2 );
    }
    //hello world.
    //you cant see this lol
    public double myMEthod2 (double x, double y, double z)
    {
      return ((x + y)/(y+z))*((x-y)/(z-y));  
    }
}
