/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

/**
 *
 * @author edisoncor
 */
public class Unidad {
    
    private String nombre;
    private Integer numeroHoras;
    private int orden;
    
    public Unidad(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "Unidad: " + this.nombre;
    }
    
}
