/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeria;

/**
 *
 * @author edisoncor
 */
public final class Gerente extends Empleado {
    
    //Atributos
    public double bonificacion;
    
    
    //operaciones o métodos
    public void generarOrden(){
        System.out.println("Orden generada");
    }
    
    public void calcularRemuneracion(){
        double remuneracion = sueldo + bonificacion;
        System.out.println("El sueldo es " + remuneracion);
    }
}
