/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author edisoncor
 */
public final class Circulo extends FiguraGeometrica{
    
    private Double radio;
    public static final Float PI = 3.141592f; 

    
    // Constructor
    // Mismo nombre que la clase
    // No tiene  tipo de dato de devoluciónb
    // inicializar el objeto
    public Circulo(Double radio) {
        this.numeroLados = 0;
        this.radio = radio;
    }
    
    
    @Override
    public Double calcularArea() {
        return PI * radio * radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
   
}
