package grafos;



import java.util.*;


public class GrafoMatriz<V extends Comparable<V>> {
    
    private List<V> vertices;
    private int[][] matrizAdyacencia;
    
    
        
    public GrafoMatriz(List<V> verticesOrdenados) {
        this.vertices = new ArrayList<>(verticesOrdenados);
        int n = vertices.size();
        matrizAdyacencia = new int[n][n];
    }

    
    public void agregarArco(V origen, V destino) {
        int i = vertices.indexOf(origen);
        int j = vertices.indexOf(destino);
        if (i != -1 && j != -1) {
            matrizAdyacencia[i][j] = 1;
        } else {
            System.out.println("Error: vértices no encontrados.");
        }
    }
    public void eliminarArco(V origen, V destino) {
        int i = vertices.indexOf(origen);
        int j = vertices.indexOf(destino);
        if (i != -1 && j != -1) {
            matrizAdyacencia[i][j] = 0;
        } else {
            System.out.println("Error: vértices no encontrados.");
        }
    }
    
    public void mostrarMatriz() {
        System.out.print("   ");
        for (V v : vertices) {
            System.out.print(v + " ");
        }
        System.out.println();

        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.print(vertices.get(i) + ": ");
            for (int j = 0; j < matrizAdyacencia[i].length; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public boolean existeArco(V origen, V destino) {
        int i = vertices.indexOf(origen);
        int j = vertices.indexOf(destino);
        if (i == -1 || j == -1) return false;
        return matrizAdyacencia[i][j] == 1;
    }
    
    public List<V> obtenerVecinosPorDerecha(V vertice) {
        List<V> vecinos = new ArrayList<>();
        int i = vertices.indexOf(vertice);
        if (i == -1) return vecinos;

        for (int j = 0; j < matrizAdyacencia[i].length; j++) {
            if (matrizAdyacencia[i][j] == 1) {
                vecinos.add(vertices.get(j));
            }
        }
        System.out.println("Vecindad R de "+vertice.toString()+":"+ vecinos.toString());
        return vecinos;
    }
    public List<V> obtenerVecinosPorIzquierda(V vertice) {
        List<V> vecinos = new ArrayList<>();
        int j = vertices.indexOf(vertice);
        if (j == -1) return vecinos;
        for (int i = 0; i < matrizAdyacencia[j].length; i ++) {
            if (matrizAdyacencia[i][j] == 1) {
                vecinos.add(vertices.get(i));
            }
        }
        System.out.println("Vecindad L de "+vertice.toString()+":"+ vecinos.toString());   
        return vecinos;
    }
    public int gradoSalienteDeV(V vertice) {
        List<V> vecinos = obtenerVecinosPorDerecha(vertice);
        System.out.println("Grado S de "+vertice+": "+vecinos.size());
        return vecinos.size();
        
    }
    
    public List<V> obtenerVecinosExtendidosPorDerecha(V vertice) {
        Set<V> vistos = new HashSet<>();
        obtenerVecinosPorDerechaRecursivo(vertice, vistos);
        
        System.out.println("Vecidad R + de "+vertice.toString()+":"+vistos);
        return new ArrayList<> (vistos);
    }
    
    public int gradoEntranteDeV(V vertice) {
        List<V> vecinos = obtenerVecinosPorIzquierda(vertice);
        System.out.println("Grado E de "+vertice+": "+vecinos.size());
        return vecinos.size();
        
    }
    
    private void obtenerVecinosPorDerechaRecursivo(V actual, Set<V> vistos) {
        int i = vertices.indexOf(actual);
        for (int j = 0; j < matrizAdyacencia[i].length; j++) {
            if (matrizAdyacencia[i][j] == 1) {
                V vecino = vertices.get(j);
                if(!vistos.contains(vecino)){
                    vistos.add(vecino);
                    obtenerVecinosPorDerechaRecursivo(vecino, vistos);
                }
            }
        }
        
    }
    
    public List<V> obtenerVecinosExtendidosPorIzquierda(V vertice) {
        Set<V> vistos = new HashSet<>();
        obtenerVecinosPorIzquierdaRecursivo(vertice, vistos);
        
        System.out.println("Vecidad L + de "+vertice.toString()+":"+vistos);
        return new ArrayList<> (vistos);
    }
    
    private void obtenerVecinosPorIzquierdaRecursivo(V actual, Set<V> vistos) {
        int j = vertices.indexOf(actual);
        for (int i = 0; i < matrizAdyacencia[j].length; i++) {
            if (matrizAdyacencia[i][j] == 1) {
                V vecino = vertices.get(i);
                if(!vistos.contains(vecino)){
                    vistos.add(vecino);
                    obtenerVecinosPorIzquierdaRecursivo(vecino, vistos);
                }
            }
        }
        
    }
    
   
    
    
}

