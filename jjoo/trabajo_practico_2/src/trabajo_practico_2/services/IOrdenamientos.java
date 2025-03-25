
package trabajo_practico_2.services;

import java.util.List;
import trabajo_practico_2.model.Jjoo;

public interface IOrdenamientos {
    
    //listado paises
    public List<Jjoo> listaPaises();
    //nuevo pais
    public void addPaises(String pais);
    //agregar medallas
    public void addMedallas(int oro, int plata, int bronce);
    //ordenar 
    public void orderBy(int oro, int plata, int bronce);
   
    
}
