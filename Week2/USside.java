

public class USside
{
    private int numberofSoldiers;
    private double numberofTanks;
    private int numberofAirplanes;
    
    public USside(int a, int b)
    {
          numberofSoldiers = a;
          numberofTanks = b;
    }
    public USside(int a, double b, int c)
    {
        numberofSoldiers=a;
        numberofTanks=b;
        numberofAirplanes=c;
    }

    public int f(int x, int y, int z)
    {
        return (x + y + z)*(x - y- z);
        
    }
    
    public double fightRusTank(double rustank){
        double rustank1 = rustank * .49;
        rustank = rustank - rustank1;
        double numoftank = numberofTanks * .51;
        numberofTanks = numberofTanks - numoftank;
        return rustank + numberofTanks;
    }
    
    public void Panda(int a)
    {
        for(int i = 0; i < 15; i++)
        {
            System.out.println(a);
        }
    }
    
}
