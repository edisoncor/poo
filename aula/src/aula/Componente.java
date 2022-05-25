/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

/**
 *
 * @author edisoncor
 */
public class Componente {

    private String nombre;
    
    public Componente(String nombre){
        this.nombre = nombre;
    }
    
    public String toString(){
        return "Componente: " + this.nombre;
    }
}
