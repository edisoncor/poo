/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clinicaveterinaria;

/**
 *
 * @author edisoncor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro = new Animal();
        perro.especie = "Perro";
        
        
        Animal gato = new Animal();
        gato.especie = "Gato";
        
        Raza husky = new Raza();
        husky.nombre = "Husky siberiano";
        
        
        Raza labrador = new Raza();
        labrador.nombre = "Labrador";
        
        Raza dalmata = new Raza();
        dalmata.nombre = "Dalmata";
        
        Raza pitbull = new Raza("Pitbull");
        
        
        Raza siames = new Raza();
        siames.nombre = "siames";
        
        Raza persa = new Raza();
        persa.nombre = "Gato persa";
        
        
        perro.razaList = new Raza[4];
        gato.razaList = new Raza[3];
        
        
        perro.razaList[0] = husky;
        perro.razaList[1] = labrador;
        perro.razaList[2] = dalmata;
        perro.razaList[3] = pitbull;
        
        System.out.println("=====perros======");
        for (int i = 0; i < perro.razaList.length; i++) {
            System.out.println(perro.razaList[i].nombre);
            
        }
        
        
        gato.razaList[0] = siames;
        gato.razaList[1] = persa;
        gato.razaList[2] = new Raza("siberiano");
        
        System.out.println("=====gatos======");
       
        for (int i = 0; i < gato.razaList.length; i++) {
            System.out.println(gato.razaList[i].nombre);   
        }
        
        System.out.println("====================");
        
        husky.animal = perro;
        persa.animal = gato;
        System.out.println(husky.animal.especie);
        System.out.println(persa.animal.especie);
    }
    
}
