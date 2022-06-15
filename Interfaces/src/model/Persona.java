/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author edisoncor
 */
public class Persona {
 
    private String apellido;
    private String identificacion;
    private String nombre;
    private String observacion;
    


    public Persona() {
    }

    public Persona(String apellido, String nombre) {
        this();
        this.apellido = apellido;
        this.nombre = nombre;
    }

    
    public Persona(String apellido, String identificacion, String nombre) {
        this(apellido, nombre);
        this.identificacion = identificacion;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return apellido + " " + nombre;
    }
    
 
     
   
}
