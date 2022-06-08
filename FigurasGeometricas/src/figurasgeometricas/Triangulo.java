/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author edisoncor
 */
public class Triangulo extends FiguraGeometrica{

    private Float base;
    private Float altura;

    public Triangulo(Float base) {
        this(base, base);
    }

    public Triangulo(Float base, Float altura) {
        this.base = base;
        this.altura = altura;
        this.numeroLados = 3;
    }
    
    @Override
    public Double calcularArea() {
        return base * altura / 2d;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
    
    
    
}
