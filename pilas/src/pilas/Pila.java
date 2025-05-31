package pilas;

public class Pila {

    private int[] datos;
    private int tope;
    private int tam;

    public Pila(int i) {
        this.tam = i;
        this.datos = new int[tam];
        this.tope = -1;
    }

    public boolean push(int ingreso) {
        if (!pilaLlena()) {
            tope++;
            datos[tope] = ingreso;
            return true;
        } else {
            return false;
        }
    }

    public int pop() {
        if (!pilaVacia()) {
            tope--;
            return datos[tope + 1];
        } else {
            return -1;
        }
    }

    public boolean pilaVacia() {
        return this.tope == -1;
    }

    public boolean pilaLlena() {
        return this.tam - 1 == this.tope;
    }

    public int verTope() {
        if (!pilaVacia()) {
            return datos[tope];
        } else {
            return -1;
        }
    }

    public int getTope() {
        return tope;
    }

    public void mostrarPila() {
        Pila paux = new Pila(tam);
        while (!pilaVacia()) {
            System.out.print(verTope() + " ");
            paux.push(this.pop());
        }
        System.out.println("");
        while (!paux.pilaVacia()) {
            push(paux.pop());
        }
    }

    public void invertirSimple() {
        Pila aux1 = new Pila(tam);
        Pila aux2 = new Pila(tam);

        while (!this.pilaVacia()) {
            aux1.push(this.pop());
        }

        while (!aux1.pilaVacia()) {
            aux2.push(aux1.pop());
        }

        while (!aux2.pilaVacia()) {
            this.push(aux2.pop());
        }
    }

    public void invertirEficiente() {
        int tamañoDePila = tope + 1;
        Pila aux = new Pila(tam);

        // Repetimos el proceso tamañoDePila veces.
        for (int posicion = 0; posicion < tamañoDePila; posicion++) {
            // Extraemos el elemento tope y lo guardamos en una variable temporal.
            int temp = this.pop();

            // Movemos (tamañoDePila - posicion - 1) elementos de la pila original a la auxiliar.
            // Esto deja el lugar para insertar 'temp' en la "base" de la parte ya procesada.
            for (int cantidadDePosicionesAMoverse = 0; cantidadDePosicionesAMoverse < tamañoDePila - posicion - 1; cantidadDePosicionesAMoverse++) {
                aux.push(this.pop());
            }

            // Insertamos el elemento temporal en la pila original.
            this.push(temp);

            while (!aux.pilaVacia()) {
                this.push(aux.pop());
            }
        }
    }

    public void pushOrdenado(int x) {
        Pila aux = new Pila(tam);

        if (x < this.verTope() && !this.pilaVacia()) {
            while (x < this.verTope()) {
                aux.push(this.pop());
            }

            this.push(x);

            while (!aux.pilaVacia()) {
                this.push(aux.pop());
            }
        } else if (this.pilaVacia() || x > this.verTope()) {
            this.push(x);
        }
    }

    public static Pila unidosMesclados(Pila pila1, Pila pila2) {
        Pila aux = new Pila((pila1.tam + pila2.tam));

        while (!pila1.pilaVacia() && !pila2.pilaVacia()) {
            if (pila1.verTope() <= pila2.verTope()) {
                aux.push(pila1.pop());
            } else {
                aux.push(pila2.pop());
            }
        }
        //Si queda algo en alguna pila y la otra esta vacia lo manda a la pila aux
        while (!pila1.pilaVacia()) {
            aux.push(pila1.pop());
        }

        while (!pila2.pilaVacia()) {
            aux.push(pila2.pop());
        }
        //************************************************************************
        //Preparamos los datos que habian quedado en el tope de aux dandolos vuelta usando p1 y
        //mandamos el resto de la pila aux a p2

        do {
            pila1.push(aux.pop());
            if (pila1.pilaLlena()) {
                while (!pila2.pilaLlena()) {
                    pila2.push(pila1.pop());
                }
            }
        } while (!pila1.pilaLlena());
        
        //Mandamos la pila que estsa lista para stackear a la pila aux
        while(!pila2.pilaVacia()){
            aux.push(pila2.pop());
        }
        //pasamos pila 1 a pila 2 para darlo vuelta y lo metemos en pila aux
        while(!pila1.pilaVacia()) {
            pila2.push(pila1.pop());
            if(pila2.pilaLlena()){
                while(!pila2.pilaVacia()){
                    aux.push(pila2.pop());
                }
            }
        }

        return aux;
    }
    
    
    public void reproBalanceado(Pila pila) {
    Pila aux1 = new Pila(pila.tam);
    Pila aux2= new Pila(pila.tam);
    
    while(!pila.pilaVacia()) {
        aux1.push(pila.pop());
    }
    
    while(!pila.pilaLlena()) {
        pila.push(aux1.pop());
        while(!aux1.pilaVacia()) {
            aux2.push(aux1.pop());
        }
        pila.push(aux2.pop());
        while(!aux2.pilaVacia()) {
            aux1.push(aux2.pop());
        }
    }
}}