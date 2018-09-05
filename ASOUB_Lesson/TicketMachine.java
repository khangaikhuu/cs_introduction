
/**
 * A Ticket Machine 
 *
 * @author (Khangaikhuu Uvgunkhuu)
 * @version (0.1)
 */
public class TicketMachine
{
    // instance variables - replace the example below with your own
    private int balance;

    /**
     * Constructor for objects of class TicketMachine
     */
    public TicketMachine()
    {
        // initialise instance variables
        balance = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return balance + y;
    }
    
    public int getBalance()
    {
        return this.balance;
    }
    
    public int getPrice()
    {
        return 0;
    }
    
    public void insertMoney (int amount)
    {
        
    }
    
    public void printTicket()
    {
        
    }
    
    public int refundBalance()
    {
        return 0;
    }
    
}
