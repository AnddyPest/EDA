package com.mycompany.practicoingtesting;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class ConversorMonedaTest {
    
    public ConversorMonedaTest() {
        
    }
    
    private static ConversorMoneda instance;
    
    @BeforeAll
    public static void setUpClass() {
        instance = new ConversorMoneda();
        System.out.println("Bienvenido al testing de Conversor de Moneda");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("El testing ha finalizado");
    }
    
        
    @BeforeEach
    public void setUp(TestInfo testName) {
        System.out.println("Test: " + testName.getDisplayName());
    }
    
    @AfterEach
    public void tearDown() {
        instance.setMonedaLocal(0.0f);
        instance.setDivisa(0.0f);
        System.out.println("Pruebas finalizadas, campos en 0(cero)");
    }

    
    @Test
    public void testCambioPesoADolar() {
        
        float resultado = instance.cambio(1000.0f, 500.0f, true); // AR$1000 a U$S, cotización 500
        assertEquals(2.0f, resultado, 0.001);
        assertEquals(2.0f, instance.getDivisa(), 0.001);
    }

    @Test
    public void testCambioDolarAPeso() {
        
        float resultado = instance.cambio(10.0f, 500.0f, false); // U$S10 a AR$, cotización 500
        assertEquals(5000.0f, resultado, 0.001);
        assertEquals(5000.0f, instance.getMonedaLocal(), 0.001);
    }

    
    @Test
    public void testCalcularCotizacionPesoDolar() {
        
        float resultado = instance.calcularCotizacion(1000.0f, 500.0f, true);
        assertEquals(2.0f, resultado, 0.001);
    }

    @Test
    public void testCalcularCotizacionDolarPeso() {
        
        float resultado = instance.calcularCotizacion(500.0f, 1000.0f, false);
        assertEquals(0.5f, resultado, 0.001);
    }

    
    @Test
    public void testAumentarSaldosPesoDolarTrue() {
        System.out.println("aumentarSaldos Pesos a dolares");
        
        instance.aumentarSaldos(true, 50.0f);
        assertEquals(50.0f, instance.getDivisa(), 0.001);
        assertEquals(0.0f, instance.getMonedaLocal(), 0.001);
    
    }
    
    @Test
    public void testAumentarSaldosPesoDolarFalse() {
        
        
        instance.aumentarSaldos(false, 100.0f);
        assertEquals(100.0f, instance.getMonedaLocal(), 0.001);
        assertEquals(0.0f, instance.getDivisa(), 0.001);
    }

    
    @Test
    public void testRetirarDivisa() {
        instance.setDivisa(200.0f);
        instance.retirarDivisa(50.0f);
        assertEquals(150.0f, instance.getDivisa(), 0.001);
    }

    
    
}
