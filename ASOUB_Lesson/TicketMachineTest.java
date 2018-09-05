

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TicketMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TicketMachineTest
{
    /**
     * Default constructor for test class TicketMachineTest
     */
    public TicketMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void insertMoneyTest()
    {
        TicketMachine testMachine = new TicketMachine(500);
        testMachine.insertMoney(350);
        assertEquals(350, testMachine.getBalance());
        assertEquals(500, testMachine.getPrice());
        testMachine.insertMoney(150);
        assertEquals(500, testMachine.getBalance());
        assertEquals(500, testMachine.getPrice());
        testMachine.printTicket();
    }
}

