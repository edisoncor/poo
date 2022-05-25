/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

/**
 *
 * @author edisoncor
 */
public class Carrera {
    
    
    private String nombre;
    private String siglas;
    
    private Facultad facultad;
    private Ciclo[] cicloList;
    
    /**
     * Constructor sin argumentos
     */
    public Carrera(){
        cicloList = new Ciclo[9];
    }
    
    /**
     * Constructor con el nombre de la carrera
     * @param nombre dado a la carrera
     */
    public Carrera(String nombre){
        this(); // llamar al constructor sin parametros
        this.nombre = nombre;
    }
   
    @Override
    public String toString(){
        return "Carrera: " + this.nombre;
    }
    
    
}
