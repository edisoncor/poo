/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rh;

/**
 *
 * @author edisoncor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Departamento carrera = new Departamento("Carrera de Computacion");
        carrera.setDepartamento(new Departamento("Facultad de la energía"));
        carrera.agregarSubDepartamento(new Departamento("Dirección de carrera"));
        carrera.agregarSubDepartamento(new Departamento("Secretaria de carrera"));
        carrera.agregarSubDepartamento(new Departamento("Claustro docente"));
        carrera.agregarServidor(new Docente("Coronels", "Edison"));
        System.out.println(carrera);
    }
    
}
