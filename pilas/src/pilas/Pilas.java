package pilas;

public class Pilas {

    public static void main(String[] args) {
        Pila p1 = new Pila(4);
        Pila p2 = new Pila(4);
        Pila p3 = new Pila(8);

        p1.push(6);
        p1.push(5);
        p1.push(4);
        p1.push(3);

        p2.push(9);
        p2.push(8);
        p2.push(7);
        p2.push(6);

        //p1.mostrarPila();

        ///p1.invertirEficiente()
        Pila p4 = p3.unidosMesclados(p1,p2);
        p4.mostrarPila();

    }

}
