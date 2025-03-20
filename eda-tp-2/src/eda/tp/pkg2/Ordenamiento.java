package eda.tp.pkg2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ordenamiento {

    public List<Integer> datos = new ArrayList<>(Arrays.asList(0,1,2,4,3,5,6,7,8,9));
    static Random random = new Random();

    //Metodo de carga del array de datos
    public void carga() {
        for (int i = 0; i < 100; i++) {
            datos.add(random.nextInt(100));
        }
    }

    ;
    
    //Muestreo de los primeros 20 numeros... se refiere a esto "Muestra()"?????
    public void muestra() {
        for (int i = 0; i < datos.size(); i++) {
            System.out.print(datos.get(i) + ", ");
        }
    }

    ;
    
    //bubbleSort
    public void bubbleSort() {
        int i, j, temp;
        boolean boton;

        for (i = (datos.size() - 1); i >= 0; i--) {
            boton = true;
            for (j = 1; j <= i; j++) {
                if (datos.get(j - 1) > datos.get(j)) {
                    temp = datos.get(j - 1);
                    datos.set(j - 1, datos.get(j));
                    datos.set(j, temp);
                    boton = false;
                    System.out.println(datos.toString());
                }
            }
            if (boton) {
                break;
            }
        }
    }

    ;
    //insertionSort
    public static void insertionSort() {

    }

    ;
    //shellSort
    public static void shellSort() {

    }
;
}
