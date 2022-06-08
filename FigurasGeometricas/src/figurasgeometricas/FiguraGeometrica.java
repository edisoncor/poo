/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author edisoncor
 */
public abstract class FiguraGeometrica {
    
    protected Integer numeroLados;
    
    
    // Método abstracto no tiene cuerpo
    // Definición del método
    // Implementarse en las subclases
    public abstract Double calcularArea();

    public Integer getNumeroLados() {
        return numeroLados;
    }
    
    
    
}
