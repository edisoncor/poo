/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeria;

/**
 *
 * @author edisoncor
 */
public abstract class Empleado extends Persona{
    
    //atributos
    public int identificador;
    public static final double sueldo = 1000;
    public final String TIPO_IDENTIFICACION = "Cédula";
    
    
    
    //operaciones o método
    public void registrarAsistencia(){
        System.out.println("Ingreso correcto");
    }
}
