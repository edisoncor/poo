/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

/**
 *
 * @author edisoncor
 */
public class Actividad {

    private Double calificacion;
    private String descripcion;
    private String nombre;
    
    private Asignacion asignacion;
    private Matricula matricula;
    private Unidad unidad;
    private Componente componente;

    public Actividad() {
    }
    
    public Actividad(String descripcion, String nombre) {
        this();
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public Actividad(String descripcion, String nombre, Unidad unidad) {
        this(descripcion, nombre);
        this.unidad = unidad;
    }

    public Actividad(String descripcion, String nombre, Unidad unidad, Componente componente) {
        this(descripcion, nombre, unidad);
        this.componente = componente;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignacion getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

    @Override
    public String toString() {
        return "Actividad{" + "descripcion=" + descripcion + ", nombre=" + nombre + ", asignacion=" + asignacion + ", matricula=" + matricula + ", unidad=" + unidad + ", componente=" + componente + '}';
    }

   
    
    
}
