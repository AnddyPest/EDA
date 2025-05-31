package com.mycompany.conversor;


public class Conversor {

    public static void main(String[] args) {
        
        ConversorMoneda billetera = new ConversorMoneda();
        billetera.setDivisa(500);
        billetera.setMonedaLocal(150000);
        
        System.out.println(billetera.mostrarBilletera());
        
        billetera.calcularCotizacion(1200000, 1000, true);
        billetera.cambio(1200000, 1200, true);
        billetera.retirarDivisa(250);
        
        
    }
}
