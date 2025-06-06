package com.mycompany.practicoingtesting;



import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.BeforeEachCallback;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(DolaritosTest.SimpleLogger.class)

public class DolaritosTest {
    
    static class SimpleLogger implements BeforeEachCallback {

        @Override
        public void beforeEach(ExtensionContext context) {
            System.out.println("Ejecutando: " + context.getDisplayName());
        }
        
    }
    
    static Stream<org.junit.jupiter.params.provider.Arguments> cotizacionProvider() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(180000f, 1500f, 120f),
            org.junit.jupiter.params.provider.Arguments.of(120000f, 0f, null),
            org.junit.jupiter.params.provider.Arguments.of(100000f, -900f, -111.11111f)
        );
    }
    
    @ParameterizedTest
    @MethodSource("cotizacionProvider")
    void testCotizarCero(float moneda1, float moneda2, Float esperado) {
        ConversorMoneda instance = new ConversorMoneda();
        if (moneda2 == 0f) {
            Assertions.assertThrows(ArithmeticException.class, () -> {
                instance.calcularCotizacion(moneda1, moneda2, true);
            });
        } else {
            float resultado = instance.calcularCotizacion(moneda1, moneda2, true);
            Assertions.assertEquals(esperado, resultado, 0.001);
        }
        
    }
        
        
}
