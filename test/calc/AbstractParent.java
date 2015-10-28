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



/**
 *
 * @author Miisu
 */
public abstract class AbstractParent {
    
   @BeforeClass
    public static void startTestSystem() {
        System.out.println("@BeforeClass TESTAAMINEN ALKAA.");
    }


    @AfterClass
    public static void stopTestSystem() {
        System.out.println("@AfterClass TESTAAMINEN VALMIS.");
    }

    @Before
    public void initTestSystem() {
        System.out.println("  @Before Käynnistä uusi testimetodi.");
    }

    @After
    public void cleanTestSystem() {
        System.out.println("  @After Testimetodi suoritettu.");
    }
}