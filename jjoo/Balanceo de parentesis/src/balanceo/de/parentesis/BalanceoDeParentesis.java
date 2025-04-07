
package balanceo.de.parentesis;

public class BalanceoDeParentesis {

    public static void main(String[] args) {
        
         String[] pruebas = {
            "{[(a+b)*c]-(d+e)}", 
            "[{()}]",            
            "[(])",              
            "([<>()])",          
            "{[(])}",            
            "<[{()}]>",
            "[(Juan<>[{}])]",
            ""
            
        };
         
         for (String prueba : pruebas) {
            System.out.println(prueba + " -> " + (MetodoBalanceo.estaEquilibrado(prueba) ? "Equilibrado" : "No equilibrado"));
        }
        
    }
    
}
