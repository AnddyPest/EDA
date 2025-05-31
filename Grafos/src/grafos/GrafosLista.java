
package grafos;

import java.util.*;


public class GrafosLista<V> {
    
    private Map<V, List<V>> listaAdyacencia;
    
    public GrafosLista() {
        listaAdyacencia = new HashMap<>();
    }
    
    public void agregarNodo(V vertice) {
        listaAdyacencia.putIfAbsent(vertice, new LinkedList<>());
    }
    
    public void eliminarNodo(V vertice) { // hay q hacer que elimine todas las aristas asociadas al nodo
        if (listaAdyacencia.containsKey(vertice)){
        listaAdyacencia.remove(vertice);
        }
    }
    
    public void agregarArista(V origen, V destino) {
        if (origen != destino) {
            listaAdyacencia.putIfAbsent(origen, new LinkedList<>());
            listaAdyacencia.putIfAbsent(destino, new LinkedList<>());
            listaAdyacencia.get(origen).add(destino);
        }
    }
    
    public void eliminarArista(V origen, V destino) {
        listaAdyacencia.remove(origen, destino);
    }
    
    public List<V> obtenerR (V vertice) {
        System.out.println("Vecindad por derecha de "+vertice+": "+listaAdyacencia.getOrDefault(vertice, new LinkedList<>()));
        return listaAdyacencia.getOrDefault(vertice, new LinkedList<>());
    }
    
    public List<V> obtenerL (V vertice) {
        List<V> vecinos = new LinkedList<>();
        for (Map.Entry<V, List<V>> entry: listaAdyacencia.entrySet()) {
            if(entry.getValue().contains(vertice)) {
                vecinos.add(entry.getKey());
            }
        }
        System.out.println("Vecindad por izquierda de "+vertice+": "+vecinos.toString());
        return vecinos;
    }
    
    // recursivo para obtener R+
    
    public Set<V> rPlus(V vertice) {
        Set<V> vistos = new HashSet<>();
        rPlusRecursivo(vertice, vistos);
        System.out.println("Vecindario R+ de "+vertice+": "+vistos.toString());
        return vistos;
        
    }
    private void rPlusRecursivo(V actual, Set<V> vistos) {
        for (V vecino : listaAdyacencia.getOrDefault(actual, new LinkedList<>()))
            if(!vistos.contains(vecino)) {
                vistos.add(vecino);
                rPlusRecursivo(vecino, vistos);
            }
    }
    public Set<V> lPlus(V vertice) {
        Set<V> vistos = new HashSet<>();
        lPlusRecursivo(vertice, vistos);
        System.out.println("Vecindario L+ de "+vertice+": "+vistos.toString());
        return vistos;
    }
    private void lPlusRecursivo(V actual, Set<V> vistos) {
        for (Map.Entry<V, List<V>> entry : listaAdyacencia.entrySet()) {
            V prueba = entry.getKey();
            List<V> vaNodo = entry.getValue();
            if(vaNodo.contains(actual) && !vistos.contains(prueba)) {
                vistos.add(prueba);
                lPlusRecursivo(prueba, vistos);
            }
        }
    }
    
    
    
    
    public void mostrarGrafoCoso () {
        for (Map.Entry<V, List<V>> entry: listaAdyacencia.entrySet()) {
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        
    }
    }
    
    
    
}
