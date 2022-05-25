/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

/**
 *
 * @author edisoncor
 */
public class Facultad {
    
    
    private String nombre;
    private String siglas;
    
    
    private Universidad universidad;
    private Carrera[] carreraList;
    
    public Facultad(){
        this.carreraList = new Carrera[6];
    }

    public Facultad(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    
    @Override
    public String toString(){
        return "Facultad: " + this.nombre;
    }
    
}
