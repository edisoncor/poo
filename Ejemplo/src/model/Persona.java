/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author edisoncor
 */
public class Persona {
    
    protected String apellido;
    protected EstadoCivil estadoCivil;
    protected String nombre;

    public Persona(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    
    
    @Override
    public String toString() {
        return "Persona{" + "apellido=" + apellido + ", nombre=" + nombre + '}';
    }

   
    
    
}
