/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author edisoncor
 */
public class VehiculoTransporte {
    
    private String color = "gris";
    
    public void pintar(String nuevoColor){
        color = nuevoColor;
    }
    
    public String  mostrarColor(){
        return color;
    }
    
}
