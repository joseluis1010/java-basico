/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Supervisor
 */
public class MultiplicationTest {

    public MultiplicationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testMultiplication() {
        assertEquals("Multiplication", 6, 3 * 3);
    }
}