/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo;

/**
 *
 * @author edisoncor
 */
public class Vehiculo {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto carro = new Auto();
        
        System.out.println(carro.mostrarColor());
        
        carro.pintar("amarillo");
        System.out.println(carro.mostrarColor());
        carro.pintar("verde");
        System.out.println(carro.mostrarColor());
        
        Moto suzuki = new Moto();
        suzuki.pintar("negro");
        System.out.println("Moto : " + suzuki.mostrarColor());
    }
    
}
