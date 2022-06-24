/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author edisoncor
 */
public class Estudiante extends Persona{
    
    private NivelEstudio nivelEstudio;

    public Estudiante(String apellido, String nombre) {
        super(apellido, nombre);
    }
    
    
    
    public enum NivelEstudio{
        PRIMARIO, SECUNDARIO, TERCER_NIVEL, CUARTO_NIVEL
    }
}
