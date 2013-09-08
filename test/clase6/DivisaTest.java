/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import clase6.pruebas.Divisa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Supervisor
 */
public class DivisaTest {

    public DivisaTest() {
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
    public void testSumarDivisa() throws Exception {
        System.out.println("TEST SUMAR DIVISAS");
        Divisa divisaJose = new Divisa(5, "Soles");
        Divisa divisaSilvia = new Divisa(20, "Soles");
        
        Divisa resultadoEsperado = new Divisa(30, "Soles");
        
        Divisa resultado = divisaSilvia.sumar(divisaJose);
        
        assertEquals(resultadoEsperado.getImporte(), resultado.getImporte());
    }
}