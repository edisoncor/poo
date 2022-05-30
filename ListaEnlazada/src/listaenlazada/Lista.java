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
    public int longitud = 0;
   
    public void agregar(Nodo nodo){
        insertar(nodo, longitud);
    }
    
    public void insertar(Nodo nodo, int posicion){
        if (estaVacia()) {
            cabeza = nodo;
        }else{
            Nodo aux = cabeza;
            int contador = 0;
            while (contador < posicion - 1 && aux.siguiente != null) {
                aux = aux.siguiente;
                contador++;
            }
            if(posicion == 0 ){
                cabeza = nodo;
                cabeza.siguiente = aux;
            }else{
                nodo.siguiente = aux.siguiente;
                aux.siguiente = nodo;
            }
        }
        longitud++;
    }
    
    public boolean estaVacia(){
        return cabeza == null;
    }
    
    public Nodo obtenerNodo(int posicion){
        if (estaVacia()){
            return null;
        }else{
            Nodo aux = cabeza;
            int contador = 0;
            while (contador < posicion && aux.siguiente != null) {
                aux = aux.siguiente;
                contador++;
            }
            if (contador!= posicion){
                return null;
            }else {
                return aux;
            }
        }
    }
    
    public void eliminarPrimero(){
        Nodo primero = cabeza;
        cabeza = cabeza.siguiente;
        primero.siguiente = null;
        longitud--;
    }
    
    public void eliminarUltimo(){
        if (!estaVacia()){
            if (cabeza.siguiente==null) {
               cabeza =null; 
            }else{
                Nodo aux = cabeza;
                while (aux.siguiente.siguiente != null) {
                    aux = aux.siguiente;
                }
                aux.siguiente = null;
            }
            longitud--;
        }
    }
     
    public void eliminar(int posicion){
        if (!estaVacia()){
           if(posicion==0){
               eliminarPrimero();
           }else{
                Nodo aux = cabeza;
                int contador = 0;
                while (contador < (posicion-1)) {
                    aux = aux.siguiente;
                    contador++;
                }
                Nodo temp = aux.siguiente;
                aux.siguiente = temp.siguiente;
                temp = null;
                longitud--;
           }
        }
    }
    
    @Override
    public String toString(){
        if (!estaVacia()){
            Nodo aux = cabeza;
            String salida = "Longitud (" + longitud + ") :";
            while (aux != null) {                
                salida = salida + aux.toString() + ", ";
                aux = aux.siguiente;
            }
            return salida;
        }
        return "Lista vacia";
    }
    
}
