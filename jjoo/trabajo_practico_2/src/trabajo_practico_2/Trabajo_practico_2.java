
package trabajo_practico_2;

import java.util.ArrayList;
import java.util.List;
import trabajo_practico_2.model.Jjoo;
import trabajo_practico_2.services.Ordenamientos;


public class Trabajo_practico_2 {

   
    public static void main(String[] args) {
        
        Ordenamientos ord = new Ordenamientos();
        
        List<Jjoo> naciones = new ArrayList<>();
        
        Jjoo p1 = new Jjoo("Argentina", 5, 2, 2);//6
        Jjoo p2 = new Jjoo("Brasil", 5, 2, 2);//5
        Jjoo p3 = new Jjoo("FEstados Unidos", 5, 2, 2);//2
        Jjoo p4 = new Jjoo("China", 5, 2, 2);//1
        Jjoo p5 = new Jjoo("DAlemania",5, 2, 2);//3
        Jjoo p6 = new Jjoo("EMejico", 5, 2, 2);//4
        
        naciones.add(p1);
        naciones.add(p2);
        naciones.add(p3);
        naciones.add(p4);
        naciones.add(p5);
        naciones.add(p6);
      
        
        for(Jjoo n: naciones){
            System.out.println("Pais: "+n.getPais()+", Oros: "+n.getOro()+", Platas: "+n.getPlata()+", Bronces: "+n.getBronce());
        }  
    
        System.out.println("");
        System.out.println("Comparacion: usando compareTo------>");
        
        System.out.println(p3.compareTo(p4));
    
        System.out.println("-----------------------------------------------");
        System.out.println("Comparacion: usando SHELL SORT");
        
        ord.orderByShell(naciones);
        
        for(Jjoo n: naciones){
            System.out.println("Pais: "+n.getPais()+", Oros: "+n.getOro()+", Platas: "+n.getPlata()+", Bronces: "+n.getBronce());
        } 
        System.out.println("-----------------------------------------------");
        System.out.println("");
        System.out.println("Cmparacion: usando INSERTION SORT");
        ord.orderByInsertion(naciones);
    
        for(Jjoo n: naciones){
            System.out.println("Pais: "+n.getPais()+", Oros: "+n.getOro()+", Platas: "+n.getPlata()+", Bronces: "+n.getBronce());
        } 
    }
    
   
    
    
}
