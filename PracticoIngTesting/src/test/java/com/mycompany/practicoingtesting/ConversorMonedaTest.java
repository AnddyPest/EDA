package com.mycompany.practicoingtesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorMonedaTest {
    
    public ConversorMonedaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of mostrarBilletera method, of class ConversorMoneda.
     */
    @Test
    public void testMostrarBilletera() {
        System.out.println("mostrarBilletera");
        ConversorMoneda instance = new ConversorMoneda();
        String expResult = "";
        String result = instance.mostrarBilletera();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambio method, of class ConversorMoneda.
     */
    @Test
    public void testCambio() {
        System.out.println("cambio");
        float moneda = 0.0F;
        float cotizacion = 0.0F;
        boolean pesoDolar = false;
        ConversorMoneda instance = new ConversorMoneda();
        float expResult = 0.0F;
        float result = instance.cambio(moneda, cotizacion, pesoDolar);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularCotizacion method, of class ConversorMoneda.
     */
    @Test
    public void testCalcularCotizacion() {
        System.out.println("calcularCotizacion");
        float moneda1 = 0.0F;
        float moneda2 = 0.0F;
        boolean pesoDolar = false;
        ConversorMoneda instance = new ConversorMoneda();
        float expResult = 0.0F;
        float result = instance.calcularCotizacion(moneda1, moneda2, pesoDolar);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aumentarSaldos method, of class ConversorMoneda.
     */
    @Test
    public void testAumentarSaldos() {
        System.out.println("aumentarSaldos");
        boolean pesoDolar = false;
        float resultado = 0.0F;
        ConversorMoneda instance = new ConversorMoneda();
        instance.aumentarSaldos(pesoDolar, resultado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirarDivisa method, of class ConversorMoneda.
     */
    @Test
    public void testRetirarDivisa() {
        System.out.println("retirarDivisa");
        float dolares = 0.0F;
        ConversorMoneda instance = new ConversorMoneda();
        instance.retirarDivisa(dolares);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonedaLocal method, of class ConversorMoneda.
     */
    @Test
    public void testGetMonedaLocal() {
        System.out.println("getMonedaLocal");
        ConversorMoneda instance = new ConversorMoneda();
        float expResult = 0.0F;
        float result = instance.getMonedaLocal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDivisa method, of class ConversorMoneda.
     */
    @Test
    public void testGetDivisa() {
        System.out.println("getDivisa");
        ConversorMoneda instance = new ConversorMoneda();
        float expResult = 0.0F;
        float result = instance.getDivisa();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonedaLocal method, of class ConversorMoneda.
     */
    @Test
    public void testSetMonedaLocal() {
        System.out.println("setMonedaLocal");
        float monedaLocal = 0.0F;
        ConversorMoneda instance = new ConversorMoneda();
        instance.setMonedaLocal(monedaLocal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDivisa method, of class ConversorMoneda.
     */
    @Test
    public void testSetDivisa() {
        System.out.println("setDivisa");
        float divisa = 0.0F;
        ConversorMoneda instance = new ConversorMoneda();
        instance.setDivisa(divisa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
