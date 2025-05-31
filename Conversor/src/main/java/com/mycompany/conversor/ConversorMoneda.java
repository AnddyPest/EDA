package com.mycompany.conversor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class ConversorMoneda {
    
    private float monedaLocal;
    private float divisa;
    
    public String mostrarBilletera() {
        return String.format("Saldo moneda local: AR$ %,.2f, Saldo en Divisa: U$S %,.2f.-", monedaLocal, divisa);
    }
        
    public float cambio(float moneda, float cotizacion, boolean pesoDolar) {
        float resultado;
        if(pesoDolar) {
            resultado = moneda/cotizacion;
            System.out.println("Conversion AR$ "+moneda+" -> U$S: "+resultado);
            System.out.println("Ha anadido U$S: "+resultado+" a su billetera");
        }else{
            resultado = moneda*cotizacion;
            System.out.println("Conversion U$S "+moneda+" -> AR$: "+resultado);
            System.out.println("Ha anadido AR$: "+resultado+" a su billetera");
        }
        aumentarSaldos(pesoDolar, resultado);
        System.out.println(mostrarBilletera());        
    return resultado;   
    }
    
    public float calcularCotizacion(float moneda1, float moneda2, boolean pesoDolar) {
        float resultado = moneda1/moneda2;
        if(pesoDolar) {
            System.out.println("Cotizacion: U$S 1 = AR$ "+resultado);
        }else{
            System.out.println("Cotizacion: AR$ 1 = U$S "+resultado);
        }
        return resultado;
    }
    
    public void aumentarSaldos(boolean pesoDolar, float resultado) {
        if(pesoDolar) {
            divisa = divisa + resultado;
        }else{
            monedaLocal = monedaLocal + resultado;
        }
    }
    
    public void retirarDivisa(float dolares) {
        divisa =divisa - dolares;
        System.out.println("Ha retirado U$S: "+dolares+" de su billetera");
        System.out.println(mostrarBilletera());
    }
    
    
    
}
