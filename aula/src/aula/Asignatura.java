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
public class Asignatura {

    private String nombre;
    private Integer numeroHoras;
    
    private Ciclo ciclo;
    private List<Unidad> unidadList;
    private List<Asignacion> asignacionList;

    public Asignatura(String nombre, Ciclo ciclo) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        unidadList = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(Integer numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    public List<Unidad> getUnidadList() {
        return unidadList;
    }

    public void setUnidadList(List<Unidad> unidadList) {
        this.unidadList = unidadList;
    }

    public List<Asignacion> getAsignacionList() {
        return asignacionList;
    }

    public void setAsignacionList(List<Asignacion> asignacionList) {
        this.asignacionList = asignacionList;
    }  
    
    @Override
    public String toString(){
        return this.nombre + " (Ciclo " + this.ciclo.getNumero() + ")";
    }
    
}
