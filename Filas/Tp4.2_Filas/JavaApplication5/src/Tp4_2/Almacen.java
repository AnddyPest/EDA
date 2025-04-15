
package Tp4_2;

import java.util.LinkedList;
import java.util.Queue;

public class Almacen {
    
    
    Pila pilaElectronicos = new Pila(10);
    Queue<Productos> FilaDeEsperaElectronicos = new LinkedList();
    
    Pila pilaALimentos = new Pila(10);
    Queue<Productos> FilaDeEsperaAlimentos = new LinkedList();
    
    Pila pilaLimpieza = new Pila(10);
    Queue<Productos> FilaDeEsperaLimpieza = new LinkedList();
    
    
    public Almacen(){
        
    }
    
    public void clasificarPorTipo(Queue<Productos> fila){
        
        while(!fila.isEmpty()){
            
            Productos productoAClasificar = fila.poll();
            
            switch(productoAClasificar.getTipo()){
                case "Electronicos":
                    if(!pilaElectronicos.pilaLlena()){
                        pilaElectronicos.push(productoAClasificar);
                    }else{
                        FilaDeEsperaElectronicos.add(productoAClasificar);
                    }
                    break;
                case "Alimentos":
                    if(!pilaALimentos.pilaLlena()){
                        pilaALimentos.push(productoAClasificar);
                    }else{
                        FilaDeEsperaAlimentos.add(productoAClasificar);
                    }
                    break;
                case "Limpieza":
                     if(!pilaLimpieza.pilaLlena()){
                        pilaLimpieza.push(productoAClasificar);
                    }else{
                        FilaDeEsperaLimpieza.add(productoAClasificar);
                    }
                    break;
            }
            
        }
        
    }
    public void despacharProductoPorTipo(String tipoDeProducto){
        
        switch(tipoDeProducto){
            case "Electronicos":
                if(!pilaElectronicos.pilaVacia()){
                    pilaElectronicos.pop();
                    if(!FilaDeEsperaElectronicos.isEmpty()){
                        pilaElectronicos.push(FilaDeEsperaElectronicos.poll());
                    }
                }
                break;
            case "Limpieza":
                if(!pilaLimpieza.pilaVacia()){
                    pilaLimpieza.pop();
                    if(!FilaDeEsperaLimpieza.isEmpty()){
                        pilaLimpieza.push(FilaDeEsperaLimpieza.poll());
                    }
                }
                break;
            case "Alimentos":
                if(!pilaALimentos.pilaVacia()){
                    pilaALimentos.pop();
                    if(!FilaDeEsperaAlimentos.isEmpty()){
                        pilaALimentos.push(FilaDeEsperaAlimentos.poll());
                    }
                }
                break;
        }
    }
    
    public boolean consultaProductoExtraviado(String identificadorABuscar){
        
        boolean isFound = false;
        Pila pilaAuxiliar = new Pila(10);
        Queue<Productos> filaAuxiliar = new LinkedList();
        switch(identificadorABuscar.toCharArray()[0]){
            case 'L':
                while(!pilaLimpieza.pilaVacia()){
                    
                    Productos elementoARevisar = pilaAuxiliar.pop();
                    
                    if(elementoARevisar.getIdentificador().toUpperCase() == identificadorABuscar.toUpperCase()){
                        isFound = true;
                    }
                    pilaAuxiliar.push(elementoARevisar);
                }
                while(!pilaAuxiliar.pilaVacia()){
                    pilaLimpieza.push(pilaAuxiliar.pop());
                }
                if(!isFound){
                    
                    while( !FilaDeEsperaLimpieza.isEmpty()){
                    
                        Productos elementoARevisar = FilaDeEsperaLimpieza.poll();
                        
                        if(elementoARevisar.getIdentificador().toUpperCase() == identificadorABuscar.toUpperCase()){
                            isFound = true;
                        }
                        filaAuxiliar.add(elementoARevisar);
                    }
                    while(!filaAuxiliar.isEmpty()){
                        FilaDeEsperaLimpieza.add(filaAuxiliar.poll());
                    }
                }
                
                break;
        
            case 'A':
                while(!pilaALimentos.pilaVacia()){
                    
                    Productos elementoARevisar = pilaAuxiliar.pop();
                    
                    if(elementoARevisar.getIdentificador().toUpperCase() == identificadorABuscar.toUpperCase()){
                        isFound = true;
                    }
                    pilaAuxiliar.push(elementoARevisar);
                }
                while(!pilaAuxiliar.pilaVacia()){
                    pilaALimentos.push(pilaAuxiliar.pop());
                }
                if(!isFound){
                    
                    while( !FilaDeEsperaAlimentos.isEmpty()){
                    
                        Productos elementoARevisar = FilaDeEsperaAlimentos.poll();
                        
                        if(elementoARevisar.getIdentificador().toUpperCase() == identificadorABuscar.toUpperCase()){
                            isFound = true;
                        }
                        filaAuxiliar.add(elementoARevisar);
                    }
                    while(!filaAuxiliar.isEmpty()){
                        FilaDeEsperaAlimentos.add(filaAuxiliar.poll());
                    }
                }
                
                break;
            case 'E':
                while(!pilaElectronicos.pilaVacia()){
                    
                    Productos elementoARevisar = pilaAuxiliar.pop();
                    
                    if(elementoARevisar.getIdentificador().toUpperCase() == identificadorABuscar.toUpperCase()){
                        isFound = true;
                    }
                    pilaAuxiliar.push(elementoARevisar);
                }
                while(!pilaAuxiliar.pilaVacia()){
                    pilaElectronicos.push(pilaAuxiliar.pop());
                }
                if(!isFound){
                    
                    while( !FilaDeEsperaElectronicos.isEmpty()){
                    
                        Productos elementoARevisar = FilaDeEsperaElectronicos.poll();
                        
                        if(elementoARevisar.getIdentificador().toUpperCase() == identificadorABuscar.toUpperCase()){
                            isFound = true;
                        }
                        filaAuxiliar.add(elementoARevisar);
                    }
                    while(!filaAuxiliar.isEmpty()){
                        FilaDeEsperaElectronicos.add(filaAuxiliar.poll());
                    }
                }
                
                break;
        }
                
        return isFound;
    }
    
}
