/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reinoanimal;

/**
 *
 * @author edisoncor
 */
public class ReinoAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro firulais = new Perro();
        firulais.nombreCientifico = "cannis";
        firulais.tienePelaje = true;
  
        Ave a = new Ave();
        a.puedeVolar = true;
        a.nombreCientifico = "avis";
        
        
        System.out.println(firulais.nombreCientifico  + " - " + firulais.tienePelaje);
        
    }
    
}
