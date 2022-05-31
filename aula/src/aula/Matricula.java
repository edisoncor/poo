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
public class Matricula {
    
    private Integer numero;

    private Estudiante estudiante;
    private List<Asignacion> asignacionList;

    public Matricula(Integer numero, Estudiante estudiante) {
        this.numero = numero;
        this.estudiante = estudiante;
        asignacionList = new LinkedList<>();
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Asignacion> getAsignacionList() {
        return asignacionList;
    }

    public void setAsignacionList(List<Asignacion> asignacionList) {
        this.asignacionList = asignacionList;
    }

    @Override
    public String toString() {
        return "Matricula{" + "numero=" + numero + ", estudiante=" + estudiante + ", asignacionList=" + asignacionList + '}';
    }

    
}
