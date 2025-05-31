
package arbolenlazado;

public class ArbolEnlazado {

    public static void main(String[] args) {
        
        ArbolBinario arbolin = new ArbolBinario();
        
        Nodo rt = arbolin.insertar(null, 43);
        arbolin.insertar(rt, 23);
        arbolin.insertar(rt, 2);
        arbolin.insertar(rt, 9);
        arbolin.insertar(rt, 36);
        arbolin.insertar(rt, 65);
        arbolin.insertar(rt, 52);
        arbolin.insertar(rt, 58);
        arbolin.insertar(rt, 91);
        
        arbolin.posOrden(rt);
        
        arbolin.buscar(rt, 58);
        
        
    }
    
}
