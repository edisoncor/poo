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
public class Asignacion {
    
    private Docente docente;
    private Paralelo paralelo;
    private Asignatura asignatura;
    
    private List<Matricula> matriculaList;

    public Asignacion(Docente docente, Paralelo paralelo, Asignatura asignatura) {
        this.docente = docente;
        this.paralelo = paralelo;
        this.asignatura = asignatura;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Paralelo getParalelo() {
        return paralelo;
    }

    public void setParalelo(Paralelo paralelo) {
        this.paralelo = paralelo;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }
    
    

    @Override
    public String toString() {
        return "\n Asignacion{" + "docente=" + docente + ", " + paralelo + ", asignatura=" + asignatura + '}';
    }
    
    
    
}
