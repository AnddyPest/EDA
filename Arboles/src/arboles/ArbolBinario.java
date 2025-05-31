
package arboles;

import java.util.ArrayList;


public class ArbolBinario {
    
    private int[] arr;
    private int capacidad;
    
    public ArbolBinario(int grado, int nivel) {
        this.capacidad = (int) Math.pow(grado, nivel)-1;
        this.arr = new  int [this.capacidad];
        for(int i = 0;i<arr.length; i++) {
            arr[i] = -1;
        }
    };
    
    public boolean insert(int dato) {
        int i = 0;
        
            if(arr[i]==-1) {
                arr[i] = dato;
            }
            else{
                while(i<capacidad && arr[i]!=-1) {
                    if(dato<=arr[i]) {
                        i = (2*i)+1;
                    }else{
                        i = (2*i)+2; 
                    }
                }
                if(i<capacidad) {
                    arr[i] = dato;
                    return true;
                }
            }
        return false;
    };
    
    public ArrayList inOrden() {
        ArrayList list = new ArrayList<>();
        inOrdenAux(list, 0);
        System.out.println("");
        
        return list;
        
    }
    
    private void inOrdenAux(ArrayList list, int index) {
        inOrdenAux(list, 2*index+1);
        list.add(arr[index]);
        System.out.println(" - "+arr[index]);
        inOrdenAux(list, 2*index+2);
        list.add(arr[index]);
        
    }
    
};
