/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Miisu
 */
public class ExtraTest extends AbstractParent {
    
    private static Calc laskin;
    private static final double DELTA = 1e-15;

    @BeforeClass
    public static void testVirtaON() {
        System.out.println("@BeforeClass Virta ON (ennen ensimmäistä testiä).");
        laskin = new Calc();
        laskin.virtaON();
    }

    @AfterClass
    public static void testVirtaOFF() {
        System.out.println("@AfterClass Virta OFF (kaikki testit ajettu).");
        laskin.virtaOFF();
        laskin = null;
    }

    @Before
    public void testNollaa() {
        System.out.println("  Nollaa laskin.");
        laskin.nollaa();
    }

    // Aseta testille maksimi kestoaika
    @Test(timeout = 1000)
    public void testNeliojuuri2() {
        laskin.neliojuuri(4);
        assertEquals("nelio(4)", 2.0, laskin.annaTulos(), DELTA);
    }
    @Test(expected = ArithmeticException.class)
    public void testNelioNegat(){
        laskin.neliojuuri(-5);
        assertEquals("nelio(-5) ", 0, laskin.annaTulos(),DELTA);
    }
    @Test
    public void testNelio2() {
        laskin.nelio(2);
        assertEquals("nelio(2) ", 4, laskin.annaTulos(),DELTA);
    }

    @Test
    public void testNelio4() {
        laskin.nelio(4);
        assertEquals("nelio(4) ",16, laskin.annaTulos(),DELTA);
    }

    @Test
    public void testNelio5() {
        laskin.nelio(5);
        assertEquals("nelio(5) ", 25, laskin.annaTulos(),DELTA);
    }

}