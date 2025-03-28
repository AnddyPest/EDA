
package trabajo_practico_2.services;

import java.util.List;
import trabajo_practico_2.model.Jjoo;


public class Ordenamientos implements IOrdenamientos{

   
    @Override
    public void orderByShell(List<Jjoo> listado) {
        for (int s = listado.size() / 2; s > 0; s /= 2) {
            for (int i = s; i < listado.size(); i++) {
                Jjoo paistemp = listado.get(i);
                int j;

                for (j = i; j >= s && listado.get(j - s).compareTo(paistemp)>0; j -= s) {
                    listado.set(j, listado.get(j - s));
                }
                listado.set(j, paistemp);
            }
        }
    }

    @Override
    public void orderByInsertion(List<Jjoo> listado) {
        for (int i = 1; i < listado.size(); i++) {
            Jjoo aux = listado.get(i);
            int j = i;
            while (j > 0 && listado.get(j-1).compareTo(aux) > 0) {
                listado.set(j, listado.get(j-1));
                j = j - 1;
            }
            listado.set(j, aux);
        }
    
    }

    

}

   
    

