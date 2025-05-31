package com.mycompany.practicoingtesting;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CotizacionTest {
    
    public CotizacionTest() {
    }
    
    @BeforeAll
    public static void setUpClass(TestInfo testName) {
        System.out.println("Test de excepcion aritmetica para cotizador");
        System.out.println("Test: "+ testName.getDisplayName());
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("Test finalizado");
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCotizarCero() {
        ConversorMoneda instance = new ConversorMoneda();
        assertThrows(ArithmeticException.class, () -> {
            instance.calcularCotizacion(1.0f, 0.0f, true);
        });
    }
}
