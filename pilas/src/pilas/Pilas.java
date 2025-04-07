package pilas;

public class Pilas {

    public static void main(String[] args) {
        Pila p1 = new Pila(10);
        Pila p2 = new Pila(10);

        p1.pushOrdenado(3);
        p1.pushOrdenado(9);
        p1.pushOrdenado(2);

        p1.mostrarPila();

        ///p1.invertirEficiente();

        p1.mostrarPila();

    }

}
