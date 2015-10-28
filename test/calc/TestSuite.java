/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;


// Testisarja kokoaa kaikki testit yhdeksi testisarjaksi, jolloin

// ne voidaan helposti ajaa kaikki yhdellä käynnistyksellä.


@RunWith(Suite.class)

@Suite.SuiteClasses({
    calc.LaskinTest.class,
    calc.NelioTest.class,
        ExtraTest.class
})

public class TestSuite {

}
