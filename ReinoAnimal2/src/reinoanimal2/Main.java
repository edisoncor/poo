/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reinoanimal2;

/**
 *
 * @author edisoncor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a; // declaracion
        a = new Animal(); // inicialización
        Carnivoro c = new Carnivoro(); // declaracion e inicilación
        new Perro(); // inicialización (objeto anonimo)
        Animal a2 = new Animal(); 
        
        System.out.println(a.nombreCintifico);
        System.out.println(c.nombreCintifico);
        System.out.println(new Perro().nombreCintifico);
        System.out.println(a2.nombreCintifico);
    }
    
}
