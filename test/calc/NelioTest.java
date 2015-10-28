/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

// Käyttää Parameterized ajuria
// Testitapaukset ja odotetut tulokset Collection-oliossa
@RunWith(Parameterized.class)
public class NelioTest {

    private static Calc laskin = new Calc();
    private double luku;
    private double tulos;
    private static final double DELTA = 1e-15;
    @Parameters
    public static List testiTapaukset() {
        return Arrays.asList(new Object[][]{
                    {0, 0},
                    {1, 1},
                    {2, 4},
                    {4, 16},
                    {5, 25},
                    {6, 36},
                    {7, 49} // 7*7 = 49, ei 48
                });
    }

    // Konstruktori, jota JUnit kutsuu kullekin listan testitapaukselle.
    // Parametrien kytkentä sijainnin / järjestyksen perusteella:
    // ekana syötetty luku, toisena odotettu arvo
    public NelioTest(double luku, double tulos) {
        this.luku = luku;
        this.tulos = tulos;
    }

    @Test
    public void testNelio() {
        String messu = luku + " * " + luku;
        laskin.nelio(luku);
        assertEquals(messu, tulos,laskin.annaTulos(),DELTA);
    }
}
