package primerparceda;

import java.util.LinkedList;
import java.util.Queue;

public class ColaEventos {

    Queue<Evento> colaOrdenada = new LinkedList<>();
    

    public void ordenarEventos(LinkedList<Evento> fila) {
        while (!fila.isEmpty()) {
            Evento actual = fila.poll(); // usamos una variabel para ir viendo los elementos q van llegando...
            int n = colaOrdenada.size();
            boolean insertado = false;

            for (int i = 0; i < n; i++) {
                Evento frente = colaOrdenada.peek();

                if (!insertado && actual.getTimestamp() < frente.getTimestamp()) {
                    // solo insertamos delante del primero mas grande que el elemento nuevo
                    colaOrdenada.add(actual);
                    insertado = true;
                }

                colaOrdenada.add(colaOrdenada.poll()); // rotamos el primero hacia atras
            }

            // si todavia no lo pudo agregar, significa q es el mas grande
            if (!insertado) {
                colaOrdenada.add(actual);
            }
        }

        // Imprimir resultados
        for (Evento evento : colaOrdenada) {
            System.out.println(evento);
        }
    }

}
