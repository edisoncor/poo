/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

/**
 *
 * @author edisoncor
 */
public class Nodo {
    
    private Integer dato;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo(Integer dato) {
        this.dato = dato;
    }

    public Integer getDato() {
        return dato;
    }

    public void setDato(Integer dato) {
        this.dato = dato;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", "
                + "\n izquierdo=" + izquierdo + ", \n    derecho=" + derecho + '}';
    }
    
    
    
    
    
}
