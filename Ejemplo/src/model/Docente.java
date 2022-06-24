/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Estudiante.NivelEstudio;

/**
 *
 * @author edisoncor
 */
public class Docente extends Persona implements Docencia{
    
    private NivelEstudio nivelEstudio; 

    public Docente(String apellido, String nombre) {
        super(apellido, nombre);
    }

   
    

    public NivelEstudio getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(NivelEstudio nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    

    @Override
    public void darClases() {
//        boolean b;
//        if (numeroHoras == 40) {
//            System.out.println("Numero de horas igual a 40");
//            b = true;
//        }else{
//            System.out.println("Numero de horas diferente a 40");
//            b = false;
//        }
//        
//        
//        String s = (numeroHoras==40)? "Número de horas igual a 40" : "Número de horas diferente a 40";
        System.out.println((numeroHoras==40)? "Número de horas igual a 40" : "Número de horas diferente a 40");
        
        nivelEstudio = NivelEstudio.CUARTO_NIVEL;
        switch (nivelEstudio) {
            case PRIMARIO:
                System.out.println("Primario");
                break;
            case SECUNDARIO:
                System.out.println("Secundario");
                break;
            case TERCER_NIVEL:
                System.out.println("Tercer nivel");
                break;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public void prepararClases() {
        UnsupportedOperationException exception;
        exception = new UnsupportedOperationException("Aún no implementado");
        throw exception;
    }
    
//    @Override
//    public void darClases() {
//        System.out.println("Dando clases....");
//    }
//
//    @Override
//    public void prepararClases() {
//        System.out.println("Preparando clases un total de " 
//                + numeroHoras + " Horas semanales");
//    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }
    
}
