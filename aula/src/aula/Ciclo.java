/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

/**
 *
 * @author edisoncor
 */
public class Ciclo {

    private Integer numero;
    private String objetivo;
    
    private Carrera carrera;
    private Asignatura[] asignaturaList;
    
    public Ciclo(){
    }
    
    public Ciclo(Integer numero){
        this.numero = numero;
    }
    
    public Ciclo(Integer numero, String objetivo){
        this(numero);
        this.objetivo = objetivo;
    }
}
