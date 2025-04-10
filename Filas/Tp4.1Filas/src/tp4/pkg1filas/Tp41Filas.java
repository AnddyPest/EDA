
package tp4.pkg1filas;

import java.util.LinkedList;
import java.util.Queue;


public class Tp41Filas {

   
    public static void main(String[] args) {
        
        Queue fila = new LinkedList<>(); 
        fila.add(5);
        fila.add(6);
        fila.add(7);
        fila.add(8);
        fila.add(15);
        
//        System.out.println("Antes");
//        mostrarFila(fila);
//        System.out.println("Despues");
//        InvertirC(fila);
//
//        System.out.println(buscarX(fila, 5));
//        mostrarFila(fila);
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
            System.out.print("Posicion: " +contador + " Elemento: " + filaAMostrar.peek()+ " || ");
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
    
}
