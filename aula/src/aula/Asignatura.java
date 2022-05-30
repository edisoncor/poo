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
public class Asignatura {

    private String nombre;
    private Integer numeroHoras;
    
    private Ciclo ciclo;
    private List<Unidad> unidadList;

    public Asignatura() {
        unidadList = new LinkedList<>();
    }
    
    
    
    @Override
    public String toString(){
        return "Asignatura: " + this.nombre;
    }
    
}
