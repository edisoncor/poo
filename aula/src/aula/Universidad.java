/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

/**
 *
 * @author edisoncor
 */
public class Universidad {
 
    private String nombre;
    private String siglas;
    
    private Facultad[] facultadList;

    public Universidad() {
        this.facultadList = new Facultad[5];
    }

    public Universidad(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    public Universidad(String nombre, String siglas){
        this(nombre);
        this.siglas = siglas;
    }
      
    @Override
    public String toString(){
        return "" + this.nombre + " - " + this.siglas;
    }
    
    
}
