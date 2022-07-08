/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.model;

import java.util.List;

/**
 *
 * @author edisoncor
 */
public class Padre {
    
    private int id;
    
    private String nombre;

    private List<Hijo> hijoList;
    
    
    
    public Padre() {
    }

    public Padre(String nombre) {
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

    public List<Hijo> getHijoList() {
        return hijoList;
    }

    public void setHijoList(List<Hijo> hijoList) {
        this.hijoList = hijoList;
    }

    @Override
    public String toString() {
        return "Padre{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
