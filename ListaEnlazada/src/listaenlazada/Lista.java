/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaenlazada;

/**
 *
 * @author edisoncor
 */
public class Lista {
    
    public Nodo cabeza;
    
    public void agregarPrimerNodo(Nodo nodo){
        cabeza = nodo;
    }
    
    public void agregar(Nodo nodo){
        if (cabeza != null) {
            Nodo aux = cabeza;
            while (aux.siguiente != null) {                
                aux = aux.siguiente;
            }
            aux.siguiente = nodo;
        }
    }
    
    
    // unificar metodos agregarPrimer Nodo con metodo agregar
    // agregar en la posición n determinadao elemento
    // eliminar el nodo n
    // Implementar recorrido en dos vías (Lista doblemente enlazada)
    // determinar la longitud de la lista
    // devlver el elemento n
    // determinar la posición de detrminado elemento
     
    @Override
    public String toString(){
        if (cabeza!=null){
            Nodo aux = cabeza;
            String salida = "";
            while (aux != null) {                
                salida = salida + aux.toString() + " - ";
                aux = aux.siguiente;
            }
            return salida;
        }
        return "Lista vacia";
    }
    
}
