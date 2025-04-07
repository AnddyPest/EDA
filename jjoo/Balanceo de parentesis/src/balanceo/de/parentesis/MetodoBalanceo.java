package balanceo.de.parentesis;

import java.util.ArrayList;

public class MetodoBalanceo {
                                                            // [({}])
    public static boolean estaEquilibrado(String cadena) {// [, ( 
        ArrayList<Character> pila = new ArrayList<>();

        for (char c : cadena.toCharArray()) {
            if (esApertura(c)) { // aperturas son: <, {, [, ( se meten a la pila con el pila.add(c)
                pila.add(c); 
            } else if (esCierre(c)) { // si el caracter es cierre: >, }, ], )
                if (pila.isEmpty()) {// si la pila esta vacia ya retorna falso
                    return false;
                }
                char ultimo = pila.remove(pila.size() - 1); // pop el elemento agregado a la pila si encuentra un cierre
                if (!esPar(ultimo, c)) { // si encuentra que no son par devuvelve falso
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    private static boolean esApertura(char c) {
        return c == '(' || c == '{' || c == '[' || c == '<';
    }

    private static boolean esCierre(char c) {
        return c == ')' || c == '}' || c == ']' || c == '>';
    }

    private static boolean esPar(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')')
                || (apertura == '{' && cierre == '}')
                || (apertura == '[' && cierre == ']')
                || (apertura == '<' && cierre == '>');
    }

}
