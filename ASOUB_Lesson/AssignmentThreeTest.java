

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AssignmentThreeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AssignmentThreeTest
{
    /**
     * Default constructor for test class AssignmentThreeTest
     */
    public AssignmentThreeTest()
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
    public void testSomethingOut()
    {
        AssignmentThree assignme1 = new AssignmentThree();
        assertEquals(2, assignme1.sampleMethod(1));
        assertEquals(5, assignme1.sampleMethod(5));
        assertEquals(15, assignme1.sampleMethod(15));
    }
}

