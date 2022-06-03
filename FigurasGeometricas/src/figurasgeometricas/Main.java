/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author edisoncor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FiguraGeometrica figura1 = new Cuadrado();
        FiguraGeometrica figura2 = new Circulo();
        FiguraGeometrica figura3 = new Triangulo();
        figura1.calcularArea();
        figura2.calcularArea();
        figura3.calcularArea();
        Float f;
        Integer i = 23;
        f = Float.parseFloat(""+i);
        System.out.println(f);
    }
    
}
