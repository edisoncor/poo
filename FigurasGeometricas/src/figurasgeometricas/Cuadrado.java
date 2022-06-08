/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author edisoncor
 */
public class Cuadrado extends FiguraGeometrica{

    private Float lado;

    public Cuadrado(Float lado) {
        this.lado = lado;
        this.numeroLados = 4;
    }
    
    @Override
    public Double calcularArea() {
        return lado * lado.doubleValue();
    }

    public Float getLado() {
        return lado;
    }

    public void setLado(Float lado) {
        this.lado = lado;
    }
    
    
}
