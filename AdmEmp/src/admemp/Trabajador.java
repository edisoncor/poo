/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admemp;

/**
 *
 * @author edisoncor
 */
public final class Trabajador extends Empleado {
    
    //atributos
    private int ingreso;
    
    //operaciones
    public void reportarIncidente(){
        System.out.println("Incidente reportado");
        Docente docente = new Docente();
        docente.impartirClase();
    }
}
