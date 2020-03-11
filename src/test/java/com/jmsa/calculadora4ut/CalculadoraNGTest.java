/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmsa.calculadora4ut;

import static org.testng.Assert.*;

/**
 *
 * @author jmsa
 */
public class CalculadoraNGTest {
    
    public CalculadoraNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @org.testng.annotations.Test
    public void testSuma() {
        // TODO review the generated test code and remove the default call to fail.
                
        Calculadora calculadora= new Calculadora();
        int result=calculadora.Suma(2, 2);
        assertEquals(4, result);
    }
    @org.testng.annotations.Test
    public void testSumaDiferente() {
        // TODO review the generated test code and remove the default call to fail.          
        Calculadora calculadora= new Calculadora();
        int result=calculadora.Suma(2, 5);
        assertEquals(7, result);
    }
    
    
}
