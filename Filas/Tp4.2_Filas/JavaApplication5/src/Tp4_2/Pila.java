package Tp4_2;

public class Pila {

    private Productos[] datos;
    private int tope;
    private int tam;

    public Pila(int i) {
        this.tam = i;
        this.datos = new Productos[tam];
        this.tope = -1;
    }

    public boolean push(Productos ingreso) {
        if (!pilaLlena()) {
            tope++;
            datos[tope] = ingreso;
            return true;
        } else {
            return false;
        }
    }

    public Productos pop() {
        Productos productoARetornar = new Productos();
        if (!pilaVacia()) {
            tope--;
            productoARetornar = datos[tope + 1];
            
        } 
        return productoARetornar;
    }

    public boolean pilaVacia() {
        return this.tope == -1;
    }

    public boolean pilaLlena() {
        return this.tam - 1 == this.tope;
    }

    public Productos verTope() {
        if (!pilaVacia() ) {
            return datos[tope];
        } else{
            return new Productos();
        }
    }

    public int getTope() {
        return tope;
    }

    public void mostrarPila() {
        Pila paux = new Pila(tam);
        while (!pilaVacia()) {
            System.out.print(verTope()+" ");
            paux.push(this.pop());
        }
        System.out.println("");
        while (!paux.pilaVacia()) {            
            push(paux.pop());
        }
    }

}
