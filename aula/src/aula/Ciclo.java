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
public class Ciclo {

    private Integer numero;
    private String objetivo;
    
    private Carrera carrera;
    private List<Asignatura> asignaturaList;
    
    public Ciclo(){
    }
    
    public Ciclo(Integer numero){
        this.numero = numero;
    }
    
    public Ciclo(Integer numero, String objetivo){
        this(numero);
        this.objetivo = objetivo;
    }

    public Ciclo(Integer numero, Carrera carrera) {
        this.numero = numero;
        this.carrera = carrera;
    }
    
    

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public List<Asignatura> getAsignaturaList() {
        return asignaturaList;
    }

    public void setAsignaturaList(List<Asignatura> asignaturaList) {
        this.asignaturaList = asignaturaList;
    }

    @Override
    public String toString() {
        return "Ciclo{" + "numero=" + numero + ", objetivo=" + objetivo + ", carrera=" + carrera + ", asignaturaList=" + asignaturaList + '}';
    }
    
    
    
}
