
package arbolestp2;

import java.util.ArrayList;
import java.util.List;


public class Arbol {
    private int[] arbolArray;
    private int capacidad;
    private int nivel;
    
    
    public Arbol(int grado, int nivel) {
        this.capacidad = (int) Math.pow(grado, nivel)-1;
        this.arbolArray = new int[capacidad];
        this.nivel = nivel;
        for(int i = 0; i < capacidad; i++) {
            arbolArray[i] = -1;
        }
    };
    
    public void insertar(int valor) {
        int index = 0;
        if(arbolArray[index] == -1) {
            arbolArray[index] = valor;
        }
        else
        {
            while(index < capacidad && arbolArray[index] != -1) {
                if(valor<=arbolArray[index]) {
                    index = (2*index) + 1;
                }
                else
                {
                    index = (2*index) +2;
                }
            }
            if(index < capacidad) {
                arbolArray[index] = valor;
            }
        
        }
        
    };
    
    public List<Integer> inOrden () {
        List<Integer> resultado = new ArrayList<>();
        inOrderRec(0, resultado);
        
        return resultado;
        
       
    };
    private void inOrderRec (int indice, List<Integer> resultado) {
        if(indice >= arbolArray.length || arbolArray[indice] ==-1){
            return;
        }
        
        inOrderRec(((2*indice)+1), resultado);
        resultado.add(arbolArray[indice]);
        inOrderRec(((2*indice)+2), resultado);
        
    }
    
    public boolean buscar(int valor) {
      int index = 0;
      while(index < capacidad) {
            if(arbolArray[index] !=-1 && arbolArray[index] !=valor){
                if(valor > arbolArray[index]){
                    index=((2*index)+2);
                }else{
                    index=((2*index)+1);
                }
            
            }
            if(index < capacidad && valor == arbolArray[index]){
                System.out.println("valor encontrado en "+index);
                return true;
            }
        }
        System.out.println("valor no encontrado");
      return false;
    };

    public void mostrarArbol() {
        for(int i = 0; i < capacidad; i++) {
            System.out.println("Posicion: "+i+" / Valor: "+arbolArray[i]);
            
        }
        System.out.println(this.inOrden().toString());
    }
      
   
    }

