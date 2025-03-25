
package trabajo_practico_2.services;

import trabajo_practico_2.model.Jjoo;


public class Ordenamientos implements IOrdenamientos, Comparable<Jjoo>{

    @Override
    public void addPaises(String pais, int oro, int plata, int bronce) {
        Jjoo nacion = new Jjoo();
        nacion.setPais(pais);
        nacion.setOro(oro);
        nacion.setPlata(plata);
        nacion.setBronce(bronce);
    }
    @Override
    public void orderBy() {
    }

    @Override
    public int compareTo(Jjoo o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
