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
public class Estudiante extends Persona{

    private String nacionalidad;
    private List<Matricula> matriculaList;

    public Estudiante(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Estudiante(String nacionalidad, String nombre, String apellido) {
        super(nombre, apellido);
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<Matricula> getMatriculaList() {
        return matriculaList;
    }

    public void setMatriculaList(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }
    
  

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
