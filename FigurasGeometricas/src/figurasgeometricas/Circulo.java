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

    @Override
    public void calcularArea() {
        System.out.println("Cálculo del área de círculo");
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
   
}
