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
public class Asignacion {
    
    // Atributos al inicio
    
    
    //Relaciones alfabetico
    private List<Actividad> actividadList;
    private Asignatura asignatura;
    private Docente docente;
    private List<Matricula> matriculaList;
    private Paralelo paralelo;

    
    //Constructores
    public Asignacion(Docente docente, Paralelo paralelo, Asignatura asignatura) {
        this.docente = docente;
        this.paralelo = paralelo;
        this.asignatura = asignatura;
        this.actividadList = new LinkedList<>();
        this.matriculaList = new LinkedList<>();
    }

    // operaciones
    
    /**
     * Agregar una actividad a los estudiantes matriculados en la asignatura
     * @param actividad Que debe contener nombre y descripción
     */
    public void agregarActividad(Actividad actividad){
        for (Matricula matricula : matriculaList) {
            matricula.getActividadList().add(actividad);
        }
    }
    
    public void listarAlumnos(){
        for (Matricula matricula : matriculaList) {
            System.out.println(matricula.getEstudiante());
        }
    }
    
    public void listarUnidades(){
        for (Unidad unidad : asignatura.getUnidadList()) {
            System.out.println(unidad);
        }
    }
    
    
    
    // set y get  seccion penultima
    
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
    
    //toString siempre al final
    
    @Override
    public String toString() {
        return "\n Asignacion{" + "docente=" + docente + ", " + paralelo + ", asignatura=" + asignatura + '}';
    }
    
    
    
}
