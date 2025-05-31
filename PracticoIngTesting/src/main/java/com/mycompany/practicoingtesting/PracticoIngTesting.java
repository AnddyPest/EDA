package com.mycompany.practicoingtesting;

public class PracticoIngTesting {

    public static void main(String[] args) {
        
        ConversorMoneda billetera = new ConversorMoneda();
        billetera.setMonedaLocal(1500000);
        billetera.setDivisa(1150);
        
        System.out.println(billetera.mostrarBilletera());
        
        billetera.calcularCotizacion(1200000, 1200, true);
        
        billetera.cambio(1200000, 1200, true);
        
        billetera.retirarDivisa(150);
        
        
        
        
    }
}
