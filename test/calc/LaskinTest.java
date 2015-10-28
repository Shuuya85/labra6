/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miisu
 */
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

// Luokan nimen loppu pitää olla Test
public class LaskinTest {

    // Fixture ("vakiokaluste"): kaikki testit käyttävät samaa laskinta,
    // joka nollataan ennen kutakin testiä.
    private static Calc laskin = new Calc();
    private static final double DELTA = 1e-15;

    @Before
    public void clearCalculator() {
        laskin.nollaa();
    }

    // Testimetodin nimi voi olla mitä tahansa, edessä annotaatio @Test    
    @Test
    public void testLisaa() {
        laskin.lisaa(1);
        laskin.lisaa(1);
        assertEquals("1 + 1 ", 2, laskin.annaTulos(),DELTA);
    }

    @Test
    public void testVahenna() {
        laskin.lisaa(10);
        laskin.vahenna(2);
        assertEquals("10 - 2 ",8, laskin.annaTulos(), DELTA);
    }

    @Test
    public void testJaa() {
        laskin.lisaa(8);
        laskin.jaa(2);
        assert laskin.annaTulos() == 4;
//assert laskin.annaTulos() == 4;
    }

    // Nollalla jaon pitäisi heittää poikkeus
    @Test(expected = ArithmeticException.class)
    public void testJaaNollalla() {
        laskin.jaa(0);
    }

    // Tätä testiä ei haluta vielä ajaa
    @Test
    @Ignore("Metodi multiply() on vielä toteuttamatta.")
    public void testKerro() {
        laskin.lisaa(10);
        laskin.kerro(10);
        assertEquals("10 * 10 ", 100, laskin.annaTulos());
    }
}

