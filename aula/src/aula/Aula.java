/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula;

/**
 *
 * @author edisoncor
 */
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Universidad universidad; //declarando un objeto
        universidad = new Universidad("Universidad Nacional de Loja", "UNL");
        System.out.println(universidad);
        
        Facultad facultad = new Facultad("Energia");
        System.out.println(facultad);
        
        Carrera computacion = new Carrera("Computación");
        System.out.println(computacion);
        Carrera sistemas = new Carrera("Sistemas");
        System.out.println(sistemas);
        
        Estudiante estudiante = new Estudiante("Juan", "Perez");
        System.out.println(estudiante);
        Estudiante estudiante2 = new Estudiante("Ecuatoriana", "Jose", "Pardo");
        System.out.println(estudiante2);
        
        Docente docente = new Docente(40, "Edison", "Coronel");
        System.out.println(docente);
        
        Asignatura poo = new Asignatura();
        System.out.println(poo);
        
        Unidad unidad = new Unidad("Clases y objetos");
        System.out.println(unidad);
        
        Componente componente = new Componente("Actividad Práctica Experimental");
        System.out.println(componente);
        
    }
    
}
