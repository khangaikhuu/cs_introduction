
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
    
    private int price;
    
    private int total;

    /**
     * Constructor for objects of class TicketMachine
     */
    public TicketMachine(int price)
    {
        // initialise instance variables
        this.price = price;
    }

    
    public int getBalance()
    {
        return this.balance;
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    public int getTotal()
    {
        return this.total;
    }
    
    public void insertMoney (int amount)
    {
        if (amount > 0)
        {
            this.balance = this.balance + amount;
        }
        else
        {
            System.out.println("Use a positive amount : " + amount);
        }
    }
    
    public void printTicket()
    {
        if (this.balance >= price)
        {
            System.out.println("###################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents");
            System.out.println("###################");
            
            total = total + price;
            
            balance = balance - price;
        } 
        else
        {
            System.out.println("You must insert at least: " + (price - balance));
        }
        
    }
    
    public int refundBalance()
    {
        return 0;
    }
    
}
