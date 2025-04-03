package pilas;

public class Pilas {

    public static void main(String[] args) {
        Pila p1 = new Pila(10);
        Pila p2 = new Pila(10);

        for(int i=0; i<10; i++)
        {
            p1.push(i);
        }

        p1.mostrarPila();

        p1.invertirEficiente();

        p1.mostrarPila();

    }

}
