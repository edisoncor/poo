/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

/**
 *
 * @author edisoncor
 */
public class Estudiante extends Persona{

    private String nacionalidad;

    public Estudiante(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Estudiante(String nacionalidad, String nombre, String apellido) {
        super(nombre, apellido);
        this.nacionalidad = nacionalidad;
    }
    
    @Override
    public String toString(){
        return this.nacionalidad + " - " + super.toString();
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
