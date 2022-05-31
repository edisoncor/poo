/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

import java.util.List;

/**
 *
 * @author edisoncor
 */
public class Docente extends Persona{
    
    private Integer dedicacion;
    private List<Asignacion> asignacionList;
    
    public Docente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Docente(Integer dedicacion, String nombre, String apellido) {
        super(nombre, apellido);
        this.dedicacion = dedicacion;
    }

    public Integer getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(Integer dedicacion) {
        this.dedicacion = dedicacion;
    }

    public List<Asignacion> getAsignacionList() {
        return asignacionList;
    }

    public void setAsignacionList(List<Asignacion> asignacionList) {
        this.asignacionList = asignacionList;
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return super.toString() + ": "+ this.dedicacion + " horas";
    }

    
}
