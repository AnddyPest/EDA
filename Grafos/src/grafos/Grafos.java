
package grafos;

import java.util.*;


public class Grafos {

    public static void main(String[] args) {
        List<String> ordenVertices = Arrays.asList("a", "b", "c", "d", "e");
        GrafoMatriz<String> grafo = new GrafoMatriz<>(ordenVertices);

        
        grafo.agregarArco("a", "b");
        grafo.agregarArco("a", "c");
        grafo.agregarArco("a", "e");
        grafo.agregarArco("c", "d");
        grafo.agregarArco("c", "a");
        grafo.agregarArco("e", "d");
        grafo.agregarArco("e", "b");

        

        grafo.mostrarMatriz();
//        grafo.obtenerVecinosPorDerecha("a");
//        grafo.obtenerVecinosPorIzquierda("a");
//        grafo.obtenerVecinosPorDerecha("b");
//        grafo.obtenerVecinosPorIzquierda("b");
        grafo.obtenerVecinosExtendidosPorDerecha("a");
//        grafo.obtenerVecinosExtendidosPorDerecha("e");
        grafo.obtenerVecinosExtendidosPorIzquierda("a");
//        grafo.obtenerVecinosExtendidosPorIzquierda("b");
//        grafo.obtenerVecinosExtendidosPorIzquierda("d");
//        grafo.gradoEntranteDeV("a");
//        
        GrafosLista grafinio = new GrafosLista<>();
        String[] nodos = {"a", "b", "c", "d", "e"};
        
        for(String node : nodos) {
            grafinio.agregarNodo(node);
        }
        
        grafinio.agregarArista("a", "b");
        grafinio.agregarArista("a", "c");
        grafinio.agregarArista("a", "e");
        grafinio.agregarArista("c", "d");
        grafinio.agregarArista("c", "a");
        grafinio.agregarArista("e", "d");
        grafinio.agregarArista("e", "b");
        
        
        grafinio.mostrarGrafoCoso();
        grafinio.rPlus("a");
        grafinio.lPlus("a");
    }
    
}
