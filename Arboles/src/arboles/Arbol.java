/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

/**
 *
 * @author edisoncor
 */
public class Arbol {
    
    private Nodo raiz;

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public void agregar(Integer numero){
        this.agregarNodo(numero, this.raiz);
    }
    
    private void agregarNodo(Integer numero, Nodo nodo){
        if (numero > nodo.getDato()){
            if (nodo.getDerecho()==null)
                nodo.setDerecho(new Nodo(numero));
            else
                agregarNodo(numero, nodo.getDerecho());
        }else{
            if (nodo.getIzquierdo() == null)
                nodo.setIzquierdo(new Nodo(numero));
            else
                agregarNodo(numero, nodo.getIzquierdo());
        }
    }
    
    public void inOrden(Nodo nodo){
        if (nodo == null)
            return;
        inOrden(nodo.getIzquierdo());
        System.out.println(nodo.getDato());
        inOrden(nodo.getDerecho());
    }
    
    public void preOrden(Nodo nodo){
        if (nodo == null)
            return;
        System.out.println(nodo.getDato());
        preOrden(nodo.getIzquierdo());
        preOrden(nodo.getDerecho());
    }
    
    public void postOrden(Nodo nodo){
        if (nodo == null)
            return;
        postOrden(nodo.getIzquierdo());
        postOrden(nodo.getDerecho());
        System.out.println(nodo.getDato());
    }
    
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    @Override
    public String toString() {
        inOrden(raiz);
        preOrden(raiz);
        postOrden(raiz);
        return "Arbol{" + "raiz=" + raiz + '}';
    }
    
    
    
}
