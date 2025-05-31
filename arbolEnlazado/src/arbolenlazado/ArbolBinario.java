
package arbolenlazado;

import java.util.ArrayList;
import java.util.List;


public class ArbolBinario {
    

    public ArbolBinario() {
    }
    
    public Nodo insertar(Nodo raiz, int valor) {
        if(raiz == null) 
        {
            raiz = new Nodo(valor); 
            
            return raiz;
        }
        
        if(valor<raiz.valor) {
            raiz.izq = this.insertar(raiz.izq, valor);
        }else{
            raiz.der = this.insertar(raiz.der, valor);
        }
        return raiz;
        
        
            
    }
    
    public List<Integer> posOrden(Nodo raiz) {
        List<Integer> resultado = new ArrayList<>();
        posOrdenRec(raiz, resultado);
        System.out.println(resultado);
        return resultado;
    }
    
    private void posOrdenRec(Nodo nod, List<Integer> resultado) {
        if(nod == null) {
            return;
        }
        resultado.add(nod.valor);//si lo pones aca al add es pre orden
        posOrdenRec(nod.izq, resultado);
         // aca es in orden
        posOrdenRec(nod.der, resultado);
        // y si lo pones aca es post orden...
        //por que? porque puede...
        
        
    }
    
    public boolean buscar (Nodo raiz, int valor) {
        Nodo nod = raiz;
        int indiceLogico = 0;
        while(nod!=null) { 
            if(nod.valor == valor){
                System.out.println("valor encontrado en "+indiceLogico);
                return true;
            }
            if(nod.valor > valor){
                nod= nod.izq;
                indiceLogico = ((2*indiceLogico)+1);
            }else{
                nod= nod.der;
                indiceLogico = ((2*indiceLogico)+2);
            }
            if(nod != null && nod.valor == valor) {
                System.out.println("valor encontrado en "+indiceLogico);
                return true;
            }
        }
        System.out.println("valor no encontrado");
        return false;
    } 
    
 
    
    
}
