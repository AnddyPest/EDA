
package Tp4_2;

import java.util.LinkedList;
import java.util.Queue;


public class Tp4_2 {

    public static void main(String[] args) {
        
        //Fila Principal
    Queue<Productos> productos = new LinkedList();
        
    productos.add(new Productos("A004", "Alimentos"));
        productos.add(new Productos("L002", "Limpieza"));
        productos.add(new Productos("E005", "Electronicos"));
        productos.add(new Productos("A001", "Alimentos"));
        productos.add(new Productos("L007", "Limpieza"));
        productos.add(new Productos("E005", "Electronicos")); // Repetido
        productos.add(new Productos("A004", "Alimentos"));   // Repetido
        productos.add(new Productos("E009", "Electronicos"));
        productos.add(new Productos("L003", "Limpieza"));
        productos.add(new Productos("A008", "Alimentos"));
        productos.add(new Productos("E003", "Electronicos"));
        productos.add(new Productos("L001", "Limpieza"));
        productos.add(new Productos("A002", "Alimentos"));
        productos.add(new Productos("E007", "Electronicos"));
        productos.add(new Productos("L004", "Limpieza"));
        productos.add(new Productos("A009", "Alimentos"));
        productos.add(new Productos("E001", "Electronicos"));
        productos.add(new Productos("L008", "Limpieza"));
        productos.add(new Productos("A006", "Alimentos"));
        productos.add(new Productos("E002", "Electronicos"));
        productos.add(new Productos("L009", "Limpieza"));
        productos.add(new Productos("A003", "Alimentos"));
        productos.add(new Productos("E003", "Electronicos")); // Repetido
        productos.add(new Productos("L006", "Limpieza"));
        productos.add(new Productos("A007", "Alimentos"));
        productos.add(new Productos("E008", "Electronicos"));
        productos.add(new Productos("L005", "Limpieza"));
        productos.add(new Productos("A005", "Alimentos"));
        productos.add(new Productos("E010", "Electronicos"));
        productos.add(new Productos("L010", "Limpieza"));
        productos.add(new Productos("A010", "Alimentos"));
        productos.add(new Productos("E006", "Electronicos"));
        productos.add(new Productos("L011", "Limpieza"));
        productos.add(new Productos("A002", "Alimentos"));   // Repetido
        productos.add(new Productos("E004", "Electronicos"));
        productos.add(new Productos("L012", "Limpieza"));
        productos.add(new Productos("A011", "Alimentos"));
        productos.add(new Productos("E011", "Electronicos"));
        productos.add(new Productos("L013", "Limpieza"));
        productos.add(new Productos("A012", "Alimentos"));
    
        Almacen almacen = new Almacen();
        
        almacen.clasificarPorTipo(productos);
        
        
    }
    
}
