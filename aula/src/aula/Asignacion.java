/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase Asignación que permite vincular un docente con un 
 * paralelo y una asignatura
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
    
    /**
     * Constructor de asignación
     * @param docente Docente al cual se le va asignar la asignatura
     * @param paralelo El paralelo de la asgnacióbn
     * @param asignatura La asignatura del docente en determinado paralelo
     */
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
        Unidad unidad = getUnidades().get(0);
        actividad.setUnidad(unidad);
        for (Matricula matricula : matriculaList) {
            matricula.getActividadList().add(actividad);
        }
    }
    
    /**
     * Listado en consola los estudiantes de determinada asignación
     */
    public void listarAlumnos(){
        for (Matricula matricula : matriculaList) {
            System.out.println(matricula.getEstudiante());
        }
    }
    
    public void listarUnidades(){
        for (Unidad unidad : getUnidades()) {
            System.out.println(unidad);
        }
    }
    
     // set y get  seccion penultima
    public List<Unidad> getUnidades(){
        return asignatura.getUnidadList();
    }
    
    public List<Actividad> getActividadList() {    
        return actividadList;
    }

    public void setActividadList(List<Actividad> actividadList) {    
        this.actividadList = actividadList;
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
    
    //toString siempre al final
    
    @Override
    public String toString() {
        return "\n Asignacion{" + "docente=" + docente + ", " + paralelo + ", asignatura=" + asignatura + '}';
    }
    
    
    
}
