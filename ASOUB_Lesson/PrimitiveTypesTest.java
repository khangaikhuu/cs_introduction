

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse PrimitiveTypesTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PrimitiveTypesTest
{
    /**
     * Konstruktor fuer die Test-Klasse PrimitiveTypesTest
     */
    public PrimitiveTypesTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInputMethod()
    {
        PrimitiveTypes primitiv1 = new PrimitiveTypes();
        assertEquals(1, primitiv1.beispielMethode(1));
        assertEquals(10, primitiv1.beispielMethode(10));
    }
}

