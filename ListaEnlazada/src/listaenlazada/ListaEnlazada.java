/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaenlazada;

/**
 *
 * @author edisoncor
 */
public class ListaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo n1 = new Nodo(6);   
        Nodo n2 = new Nodo(9);
        Nodo n3 = new Nodo(8);
      
        
        Lista le = new Lista();
        le.agregar(n1);
        System.out.println(le);
        le.agregar(n2);
        System.out.println(le);
        le.agregar(n3);
        System.out.println(le);
        le.agregar(new Nodo(45));
        System.out.println(le);
        le.agregar(new Nodo(76));
        System.out.println(le);
        le.insertar(new Nodo(333), 2);
        System.out.println(le);
        
        le.eliminar(2);
        System.out.println(le); 
    }
    
}
