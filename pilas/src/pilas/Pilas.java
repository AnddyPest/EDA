package pilas;

import static pilas.Pila.unidosMesclados;


public class Pilas {

    public static void main(String[] args) {
        
        Pila p1 = new Pila(5);
        //Pila p2 = new Pila(4);
        

       
        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);
        p1.push(5);

//        p2.push(9);
//        p2.push(8);
//        p2.push(7);
//        p2.push(6);

        //p1.mostrarPila();

        ///p1.invertirEficiente()
        ///
//        p1.mostrarPila();
//        p2.mostrarPila();
//        Pila mezclada = unidosMesclados(p1,p2);
//        System.out.println("Pila mezclada");
//        mezclada.mostrarPila();
//        System.out.println("Pila 1");
//        p1.mostrarPila();
//        System.out.println("Pila 2");
//        p2.mostrarPila();   
        
          p1.reproBalanceado(p1);
           p1.mostrarPila();

    }

}
