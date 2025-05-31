
package primerparceda;

import java.util.LinkedList;



public class PrimerParcEDA {
   

    public static void main(String[] args) {
        
        LinkedList<Evento> fila = new LinkedList<>();
           ColaEventos order = new ColaEventos();
        // Insertar eventos
        fila.add(new Evento(3, "Evento 1"));
        fila.add(new Evento(1, "Evento 2")); // ESTE ENTRA DESORDENADO A VER SI ORDENA
        fila.add(new Evento(2, "Evento 3"));
        fila.add(new Evento(5, "Evento 4"));
        fila.add(new Evento(4, "Evento 5"));
        fila.add(new Evento(0, "Evento 6"));
        System.out.println("Lista de eventos ordenados:");
        order.ordenarEventos(fila);
    }

    
}
