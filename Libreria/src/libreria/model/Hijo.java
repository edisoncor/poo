/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.model;

/**
 *
 * @author edisoncor
 */
public class Hijo {
    
    private int id;
    
    private String nombre;
    
    private Padre padre;

    public Hijo() {
    }

    public Hijo(String nombre, Padre padre) {
        this.nombre = nombre;
        this.padre = padre;
    }

    public Hijo(String nombre) {
        this.nombre = nombre;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Padre getPadre() {
        return padre;
    }

    public void setPadre(Padre padre) {
        this.padre = padre;
    }
    
    
    
    
}
