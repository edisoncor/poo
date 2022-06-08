/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arboles;

/**
 *
 * @author edisoncor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol arbol = new Arbol(new Nodo(7));
        arbol.agregar(3);
        arbol.agregar(10);
        arbol.agregar(5);
        arbol.agregar(2);
        System.out.println(arbol);
    }
    
    
}
