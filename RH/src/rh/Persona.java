/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rh;

/**
 *
 * @author edisoncor
 */
public abstract class Persona {
    
    private String apellido;
    private String identificacion;
    private String nombre;

    public Persona(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Persona(String apellido, String identificacion, String nombre) {
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    void rectificarInformacion(String nuevoApellido, String nuevoNombre){
        this.apellido = nuevoApellido;
        this.nombre = nuevoNombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre;
    }
    
    
    
}
