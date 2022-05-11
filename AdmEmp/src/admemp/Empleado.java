/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admemp;

/**
 *
 * @author edisoncor
 */
public abstract class Empleado {
    
    //atributos
    public String nombre;
    
    //relaciones
    private Departamento departamento;
    
    //operaciones
    public void registrarAsistencia(String dia){
        System.out.println("Se registro asistencia del día:" + dia);
    }
    
}
