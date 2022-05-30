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
public class Carrera {
    
    
    private String nombre;
    private String siglas;
    
    private Facultad facultad;
    private List<Ciclo> cicloList;
    
    /**
     * Constructor sin argumentos
     */
    public Carrera(){
        cicloList = new LinkedList<>() ;
    }
    
    /**
     * Constructor con el nombre de la carrera
     * @param nombre dado a la carrera
     */
    public Carrera(String nombre){
        this(); // llamar al constructor sin parametros
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public List<Ciclo> getCicloList() {
        return cicloList;
    }

    public void setCicloList(List<Ciclo> cicloList) {
        this.cicloList = cicloList;
    }
    
    
    
   
    @Override
    public String toString(){
        return "Carrera: " + this.nombre;
    }
    
    
}
