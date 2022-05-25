/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

/**
 *
 * @author edisoncor
 */
public class Asignatura {

    private String nombre;
    private Integer numeroHoras;
    
    private Ciclo ciclo;
    
    @Override
    public String toString(){
        return "Asignatura: " + this.nombre;
    }
    
}
