
package trabajo_practico_2;

import java.util.ArrayList;
import java.util.List;
import trabajo_practico_2.model.Jjoo;
import trabajo_practico_2.services.Ordenamientos;


public class Trabajo_practico_2 {

   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Jjoo> naciones = new ArrayList<>()


        int opcion = scanner.nextInt();


        while (opcion != 0)
        {
            System.out.println("1 - Añadir Pais");
            System.out.println("2 - Ordenar Lista");
            System.out.println("3 - Mostrar lista de paises");
            System.out.println("4 - Mostrar Rancking");
            System.out.println("0 - Salir");

            switch (opcion){
                case 1:
                    String repetir = "y";

                    while(repetir.equalsIgnoreCase("y")) {
                        System.out.println("Ingrese nombre");
                        String nombre = scanner.nextString()

                        System.out.println("Ingrese cantidad de Medallas de Oro");
                        int medallasDeOro = scanner.nextInt();

                        System.out.println("Ingrese cantidad de medallas de plata");
                        int medallasDePlata = scanner.nextInt()

                        System.out.println("Ingrese cantidad de medallas de bronce");
                        int medallasDeBronce = scanner.nextInt();

                        Jjoo jjoo = new Jjoo(nombre, medallasDeOro, medallasDePlata, medallasDeBronce);

                        System.out.println("Desea añadir otro pais y/n: ");
                        repetir = scanner.nextString();
                    }
                case 2:

            }

        }

    }
    
   
    
    
}
