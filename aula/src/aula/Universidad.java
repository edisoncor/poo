/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author edisoncor
 */
public class Universidad {
 
    private String nombre;
    private String siglas;
        
    private List<Facultad> facultadList;
    

    public Universidad() {
        this.facultadList = new LinkedList<>();
    }

    public Universidad(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    public Universidad(String nombre, String siglas){
        this(nombre);
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public List<Facultad> getFacultadList() {
        return facultadList;
    }

    public void setFacultadList(List<Facultad> facultadList) {
        this.facultadList = facultadList;
    }
    
    
   
      
    @Override
    public String toString(){
        return "" + this.nombre + " - " + this.siglas + " " + this.getFacultadList();
    }
    
}
