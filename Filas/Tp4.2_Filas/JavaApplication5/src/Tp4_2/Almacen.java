
package Tp4_2;

import java.util.LinkedList;
import java.util.Queue;

public class Almacen {


    Pila pilaElectronicos = new Pila(9);
    Queue<Productos> FilaDeEsperaElectronicos = new LinkedList();

    Pila pilaALimentos = new Pila(9);
    Queue<Productos> FilaDeEsperaAlimentos = new LinkedList();

    Pila pilaLimpieza = new Pila(9);
    Queue<Productos> FilaDeEsperaLimpieza = new LinkedList();


    public Almacen() {

    }

    public void clasificarPorTipo(Queue<Productos> fila) {

        while (!fila.isEmpty()) {

            Productos productoAClasificar = fila.poll();

            switch (productoAClasificar.getTipo()) {
                case "Electronicos":
                    if (!pilaElectronicos.pilaLlena()) {
                        pilaElectronicos.push(productoAClasificar);
                    } else {
                        FilaDeEsperaElectronicos.add(productoAClasificar);
                    }
                    break;
                case "Alimentos":
                    if (!pilaALimentos.pilaLlena()) {
                        pilaALimentos.push(productoAClasificar);
                    } else {
                        FilaDeEsperaAlimentos.add(productoAClasificar);
                    }
                    break;
                case "Limpieza":
                    if (!pilaLimpieza.pilaLlena()) {
                        pilaLimpieza.push(productoAClasificar);
                    } else {
                        FilaDeEsperaLimpieza.add(productoAClasificar);
                    }
                    break;
            }

        }

    }

    public void despacharProductoPorTipo(String tipoDeProducto) {

        switch (tipoDeProducto) {
            case "Electronicos":
                if (!pilaElectronicos.pilaVacia()) {
                    pilaElectronicos.pop();
                    if (!FilaDeEsperaElectronicos.isEmpty()) {
                        pilaElectronicos.push(FilaDeEsperaElectronicos.poll());
                    }
                }
                break;
            case "Limpieza":
                if (!pilaLimpieza.pilaVacia()) {
                    pilaLimpieza.pop();
                    if (!FilaDeEsperaLimpieza.isEmpty()) {
                        pilaLimpieza.push(FilaDeEsperaLimpieza.poll());
                    }
                }
                break;
            case "Alimentos":
                if (!pilaALimentos.pilaVacia()) {
                    pilaALimentos.pop();
                    if (!FilaDeEsperaAlimentos.isEmpty()) {
                        pilaALimentos.push(FilaDeEsperaAlimentos.poll());
                    }
                }
                break;
        }
    }

    public boolean consultaProductoExtraviado(String identificadorABuscar) {

        boolean isFound = false;
        Pila pilaAuxiliar = new Pila(10);
        Queue<Productos> filaAuxiliar = new LinkedList();
        switch (identificadorABuscar.toCharArray()[0]) {
            case 'L':
                while (!pilaLimpieza.pilaVacia()) {

                    Productos elementoARevisar = pilaLimpieza.pop();

                    if (elementoARevisar.getIdentificador().toUpperCase() == identificadorABuscar.toUpperCase()) {
                        isFound = true;
                    }
                    pilaAuxiliar.push(elementoARevisar);
                }
                while (!pilaAuxiliar.pilaVacia()) {
                    pilaLimpieza.push(pilaAuxiliar.pop());
                }
                if (!isFound) {

                    while (!FilaDeEsperaLimpieza.isEmpty()) {

                        Productos elementoARevisar = FilaDeEsperaLimpieza.poll();

                        if (elementoARevisar.getIdentificador().toUpperCase() == identificadorABuscar.toUpperCase()) {
                            isFound = true;
                        }
                        filaAuxiliar.add(elementoARevisar);
                    }
                    while (!filaAuxiliar.isEmpty()) {
                        FilaDeEsperaLimpieza.add(filaAuxiliar.poll());
                    }
                }

                break;

            case 'A':
                while (!pilaALimentos.pilaVacia()) {

                    Productos elementoARevisar = pilaALimentos.pop();

                    if (elementoARevisar.getIdentificador().toUpperCase() == identificadorABuscar.toUpperCase()) {
                        isFound = true;
                    }
                    pilaAuxiliar.push(elementoARevisar);
                }
                while (!pilaAuxiliar.pilaVacia()) {
                    pilaALimentos.push(pilaAuxiliar.pop());
                }
                if (!isFound) {

                    while (!FilaDeEsperaAlimentos.isEmpty()) {

                        Productos elementoARevisar = FilaDeEsperaAlimentos.poll();

                        if (elementoARevisar.getIdentificador().toUpperCase() == identificadorABuscar.toUpperCase()) {
                            isFound = true;
                        }
                        filaAuxiliar.add(elementoARevisar);
                    }
                    while (!filaAuxiliar.isEmpty()) {
                        FilaDeEsperaAlimentos.add(filaAuxiliar.poll());
                    }
                }

                break;
            case 'E':
                while (!pilaElectronicos.pilaVacia()) {

                    Productos elementoARevisar = pilaElectronicos.pop();

                    if (elementoARevisar.getIdentificador().toUpperCase() == identificadorABuscar.toUpperCase()) {
                        isFound = true;
                    }
                    pilaAuxiliar.push(elementoARevisar);
                }
                while (!pilaAuxiliar.pilaVacia()) {
                    pilaElectronicos.push(pilaAuxiliar.pop());
                }
                if (!isFound) {

                    while (!FilaDeEsperaElectronicos.isEmpty()) {

                        Productos elementoARevisar = FilaDeEsperaElectronicos.poll();

                        if (elementoARevisar.getIdentificador().toUpperCase() == identificadorABuscar.toUpperCase()) {
                            isFound = true;
                        }
                        filaAuxiliar.add(elementoARevisar);
                    }
                    while (!filaAuxiliar.isEmpty()) {
                        FilaDeEsperaElectronicos.add(filaAuxiliar.poll());
                    }
                }

                break;
        }

        return isFound;
    }

    public void cosultarEspera(String categoria) {
        Queue<Productos> aux = new LinkedList();

        switch (categoria) {
            case "Electronicos":
                while (!FilaDeEsperaElectronicos.isEmpty()) {
                    Productos elemento = FilaDeEsperaElectronicos.poll();
                    System.out.print("[" + elemento.getIdentificador() + ", " + "]");
                    aux.add(elemento);
                }

                while (!aux.isEmpty()) {
                    Productos elemento = aux.poll();
                    FilaDeEsperaElectronicos.add(elemento);
                }
                break;
            case "Alimentos":
                while (!FilaDeEsperaAlimentos.isEmpty()) {
                    Productos elemento = FilaDeEsperaAlimentos.poll();
                    System.out.print("[" + elemento.getIdentificador() + ", " + "]");
                    aux.add(elemento);
                }

                while (!aux.isEmpty()) {
                    Productos elemento = aux.poll();
                    FilaDeEsperaAlimentos.add(elemento);
                }
                break;
            case "Limpieza":
                while (!FilaDeEsperaLimpieza.isEmpty()) {
                    Productos elemento = FilaDeEsperaLimpieza.poll();
                    System.out.print("[" + elemento.getIdentificador() + ", " + "]");
                    aux.add(elemento);
                }

                while (!aux.isEmpty()) {
                    Productos elemento = aux.poll();
                    FilaDeEsperaLimpieza.add(elemento);
                }
                break;
        }
    }

    public void cantidadDeProductos(String categoria)
    {
        //Definir si deberia incluir la cantidad total o solo lo que esta en stock.

        Queue<Productos> aux = new LinkedList();

        switch (categoria)
        {
            case "Alimentos":
                Pila productosAlimentos = new Pila(10);
                int contadorAlimentos = 0;

                while (!pilaALimentos.pilaVacia() || !FilaDeEsperaAlimentos.isEmpty())
                {

                    if(!pilaALimentos.pilaVacia())
                    {
                        Productos producto = pilaALimentos.pop();
                        productosAlimentos.push(producto);

                        contadorAlimentos++;
                    }

                    if(!FilaDeEsperaAlimentos.isEmpty())
                    {
                        Productos producto = FilaDeEsperaAlimentos.poll();
                        aux.add(producto);

                        contadorAlimentos++;
                    }
                }

                while (!productosAlimentos.pilaVacia())
                {
                    Productos elemento = productosAlimentos.pop();
                    pilaALimentos.push(elemento);
                }

                while (!aux.isEmpty())
                {
                    Productos elemento = aux.poll();
                    FilaDeEsperaAlimentos.add(elemento);
                }

                System.out.println("Existen " + contadorAlimentos + " productos de la categoria " + categoria);
                break;
            case "Electronicos":
                Pila productosElectronicos = new Pila(10);
                int contadorElectronicos = 0;

                while (!pilaElectronicos.pilaVacia() || !FilaDeEsperaElectronicos.isEmpty())
                {

                    if(!pilaElectronicos.pilaVacia())
                    {
                        Productos producto = pilaElectronicos.pop();
                        productosElectronicos.push(producto);

                        contadorElectronicos++;
                    }

                    if(!FilaDeEsperaElectronicos.isEmpty())
                    {
                        Productos producto = FilaDeEsperaElectronicos.poll();
                        aux.add(producto);

                        contadorElectronicos++;
                    }
                }

                while (!productosElectronicos.pilaVacia())
                {
                    Productos elemento = productosElectronicos.pop();
                    pilaElectronicos.push(elemento);
                }

                while (!aux.isEmpty())
                {
                    Productos elemento = aux.poll();
                    FilaDeEsperaElectronicos.add(elemento);
                }

                System.out.println("Existen " + contadorElectronicos + " productos de la categoria " + categoria);
                break;
            case "Limpieza":
                Pila productosLimpieza = new Pila(10);
                int contadorLimpieza = 0;

                while (!pilaLimpieza.pilaVacia() || !FilaDeEsperaLimpieza.isEmpty())
                {

                    if(!pilaLimpieza.pilaVacia())
                    {
                        Productos producto = pilaLimpieza.pop();
                        productosLimpieza.push(producto);

                        contadorLimpieza++;
                    }

                    if(!FilaDeEsperaLimpieza.isEmpty())
                    {
                        Productos producto = FilaDeEsperaLimpieza.poll();
                        aux.add(producto);

                        contadorLimpieza++;
                    }
                }

                while (!productosLimpieza.pilaVacia())
                {
                    Productos elemento = productosLimpieza.pop();
                    pilaLimpieza.push(elemento);
                }

                while (!aux.isEmpty())
                {
                    Productos elemento = aux.poll();
                    FilaDeEsperaLimpieza.add(elemento);
                }

                System.out.println("Existen " + contadorLimpieza + " productos de la categoria " + categoria);
                break;
        }
    }
}
