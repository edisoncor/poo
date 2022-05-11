/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzeria;

/**
 *
 * @author edisoncor
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gerente g = new Gerente();
        g.identificador = 123;
        g.nombre = "Juan";
        g.bonificacion = 700;
        g.registrarAsistencia();
        g.generarOrden();
        g.calcularRemuneracion();
        g.calcularRemuneracion();
       
        Cliente c = new Cliente();
        c.nombre = "Pedro";
        c.generarPediso();
        
        
        Mesero m = new Mesero();
        m.tomarPedido();
        m.registrarAsistencia();
        
        System.out.println("El sueldo de los empleado es: "+ Mesero.sueldo);
       
    }
    
}
