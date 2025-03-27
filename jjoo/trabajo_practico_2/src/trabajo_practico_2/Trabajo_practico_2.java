package trabajo_practico_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import trabajo_practico_2.model.Jjoo;
import trabajo_practico_2.services.Ordenamientos;

public class Trabajo_practico_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Jjoo> naciones = new ArrayList<>();
        Ordenamientos ord = new Ordenamientos();

        int opcion = 999;

        while (opcion != 0) {
            System.out.println("1 - Añadir Pais");
            System.out.println("2 - Ordenar Lista");
            System.out.println("3 - Mostrar lista de paises");
            System.out.print("4 - Mostrar Ranking");
            System.out.println(" -- Asegurese de ordernar los participantes antes de ejecutar este comando");
            System.out.println("0 - Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    String repetir = "y";

                    while (repetir.equalsIgnoreCase("y")) {
                        System.out.println("Ingrese nombre");
                        String nombre = scanner.nextLine();

                        System.out.println("Ingrese cantidad de Medallas de Oro");
                        int medallasDeOro = scanner.nextInt();

                        System.out.println("Ingrese cantidad de medallas de plata");
                        int medallasDePlata = scanner.nextInt();

                        System.out.println("Ingrese cantidad de medallas de bronce");
                        int medallasDeBronce = scanner.nextInt();

                        scanner.nextLine(); // Limpiar scanner

                        Jjoo jjoo = new Jjoo(nombre, medallasDeOro, medallasDePlata, medallasDeBronce);

                        if(!naciones.contains(jjoo))
                        {
                            naciones.add(jjoo);
                        }else {
                            System.out.println("Este pais ya esta en la lista inserte otro");
                        }

                        System.out.println("Desea añadir otro pais y/n: ");
                        repetir = scanner.nextLine();

                    }
                    break;
                case 2:
                    String aceptar = "n";
                    System.out.println("¿Desea ordenar la lista?");
                    aceptar = scanner.nextLine();

                    if (aceptar.equalsIgnoreCase("y")) {
                        System.out.println("¿Que metodo de ordenamiento desea emplear?");
                        System.out.println("1 - Shell Sort // 2 - Insertion Sort");
                        int metodo = scanner.nextInt();
                        switch (metodo) {
                            case 1:

                                long inicio = System.currentTimeMillis();
                                ord.orderByShell(naciones);
                                long fin = System.currentTimeMillis();
                                long tiempoFinal = fin - inicio;

                                System.out.println("Metodo Shell Sort aplicado, demoro: " + tiempoFinal + " milisegundos");

                                break;
                            case 2:
                                long inicio2 = System.currentTimeMillis();
                                ord.orderByInsertion(naciones);
                                long fin2 = System.currentTimeMillis();

                                long tiempoFinal2 = fin2 - inicio2;

                                System.out.println("Metodo Insertion Sort aplicado, demoro: "+ tiempoFinal2 + " milisegundos");

                                break;

                            default:
                                System.out.println("Elija una opcion valida!");
                        }
                    }
                    break;
                case 3:
                    for (Jjoo n : naciones) {
                        System.out.println("Pais: " + n.getPais() + ", Oros: " + n.getOro() + ", Plata: " + n.getPlata() + ", Broce: " + n.getBronce());

                    }
                    break;
                case 4:
                    for (Jjoo n : naciones) {
                        int rank = (naciones.indexOf(n)) + 1;
                        n.setRanking(rank);
                        System.out.println("Ranking: " + n.getRanking() + ", Pais: " + n.getPais());
                    }

                    break;

                default:
                    System.out.println("Elija una opcion valida (DE 0 a 4)");
            }

        }
    }
}
