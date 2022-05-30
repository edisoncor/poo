/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaenlazada;

/**
 *
 * @author edisoncor
 */
public class Nodo {
    
    public int dato;
    public Nodo siguiente = null;
    
    public Nodo(int numero){
        this.dato = numero;
    }

    @Override
    public String toString() {
        return "" + dato ;
    }
    
    
    
}
