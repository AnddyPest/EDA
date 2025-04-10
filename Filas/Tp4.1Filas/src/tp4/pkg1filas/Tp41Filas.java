
package tp4.pkg1filas;

import java.util.LinkedList;
import java.util.Queue;


public class Tp41Filas {

   
    public static void main(String[] args) {
        
        Queue fila = new LinkedList<>(); 
        fila.add(5);
        fila.add(6);
       
        fila.add(6);
        fila.add(7);
        fila.add(8);
        fila.add(8);
        fila.add(8);
        fila.add(15);
        fila.add(15);
        fila.add(12);
        
//        System.out.println("Antes");
//        mostrarFila(fila);
//        System.out.println("Despues");
//        InvertirC(fila);
//
//        System.out.println(buscarX(fila, 5));
//        mostrarFila(fila);
//        ParesEImpares(fila);
//        UnirFilasAYBEnC();
        eliminarRepetidos(fila);
    }
    public static void InvertirC(Queue filaAinvertir){
        
        Queue filaAuxiliar = new LinkedList();
        Queue filaResuelta = new LinkedList();
        
        int tamañoInicialDeLaPrincipal = filaAinvertir.size();
        
        for(int i = 0 ; i < tamañoInicialDeLaPrincipal; i++){
            int tamañoActualDeLaPrincipal = filaAinvertir.size();
            while( !filaAinvertir.isEmpty() ){
                if(tamañoActualDeLaPrincipal == 1){
                    filaResuelta.add(filaAinvertir.poll());
                   
                }else{
                    filaAuxiliar.add(filaAinvertir.poll());
                     tamañoActualDeLaPrincipal--;
                }
            }
            while(!filaAuxiliar.isEmpty()){
                filaAinvertir.add(filaAuxiliar.poll());
            }
        }
        
        
        mostrarFila(filaResuelta);
        //retornar fila Resuelta
    }
    public static void mostrarFila(Queue filaAMostrar){
        
        Queue filaAuxiliar = new LinkedList();
        int contador= 0;
        
        while(!filaAMostrar.isEmpty()){
            System.out.print("Posicion: " +contador + " Elemento: " + filaAMostrar.peek()+ "\n || ");
            filaAuxiliar.add(filaAMostrar.poll());
            contador++;
        }
        while(!filaAuxiliar.isEmpty()){
            filaAMostrar.add(filaAuxiliar.poll());
        }
        
        
    }
    
    public static boolean buscarX(Queue<Integer> filaEnDondeBuscar, Integer elementoABuscar){
        
        //SE QUE NO LA VA A MODIFICAR PERO NO QUIERO REESTRUCTURAR TODO
        //Modificar
        Queue<Integer> filaAuxiliar = new LinkedList<>();
       
        boolean resultado = false;
        while(!filaEnDondeBuscar.isEmpty()){
            
            if(elementoABuscar == filaEnDondeBuscar.peek()){
                resultado = true;
                break;
            }
            filaAuxiliar.add(filaEnDondeBuscar.poll());
        }
        while(!filaAuxiliar.isEmpty()){
            filaEnDondeBuscar.add(filaAuxiliar.poll());
        }
        mostrarFila(filaEnDondeBuscar);
        return resultado;
        
    }
    public static void ParesEImpares(Queue<Integer> filaADividir){
        Queue<Integer> filaDePares = new LinkedList<>();
        Queue<Integer> filasImpares = new LinkedList<>();
        
        while(!filaADividir.isEmpty()){
            if(filaADividir.peek() % 2 == 0){
                filaDePares.add(filaADividir.poll());
            }else{
                filasImpares.add(filaADividir.poll());
            }
        }
        System.out.println("Fila de pares");
        mostrarFila(filaDePares);
        System.out.println("Fila de Impares");
        mostrarFila(filasImpares);
    }
    
    public static void UnirFilasAYBEnC(){
        
        Queue<Integer> filaA = new LinkedList<>();
        Queue<Integer> filaB = new LinkedList<>();
        Queue<Integer> filaC = new LinkedList<>();

        filaB.add(9);
        filaB.add(8);
        filaB.add(7);
        filaB.add(6);
        filaA.add(8);
        filaA.add(7);
        filaA.add(6);
        filaA.add(4);
        filaA.add(2);
        
        while(!filaA.isEmpty() && !filaB.isEmpty()){
            if( filaA.peek() >= filaB.peek() ){
                filaC.add(filaA.poll());
            }else{
                filaC.add(filaB.poll());
            }       
        }
        while(!filaA.isEmpty()){
            filaC.add(filaA.poll());
        }
        while(!filaB.isEmpty()){
            filaC.add(filaB.poll());
        }
        mostrarFila(filaC);
    }
    
    public static void eliminarRepetidos(Queue<Integer> listaAEliminarRepetidos){
        
        Queue<Integer> listaFiltrada = new LinkedList<>();
        
        while(!listaAEliminarRepetidos.isEmpty()){
            int valorObservado = listaAEliminarRepetidos.poll();
            boolean validado = true;
            while(validado){
                if( !listaAEliminarRepetidos.isEmpty() && valorObservado == listaAEliminarRepetidos.peek()){
                    listaAEliminarRepetidos.poll();
                }else{
                    listaFiltrada.add(valorObservado);
                    validado = false;
                }    
            }
            
        }
        mostrarFila(listaFiltrada);
    }
    
}
