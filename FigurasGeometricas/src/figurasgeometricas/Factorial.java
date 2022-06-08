/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * Factorial de un número
 * 1! = 1           = 1
 * 2! = 2X1         = 2
 * 3! = 3X2X1       = 6
 * 4! = 4X3X2X1     = 24
 * 5! = 5x4x3x2x1   = 120
 * 
 * 
 * 
 * 1! = 1           = 1
 * 2! = 2 x 1!      = 2
 * 3! = 3 x 2!      = 6
 * 4! = 4 x 3!      = 24
 * 5! = 5 x 4!      = 120
 * 
 * n! = n x (n-1)!  = m
 * 
 * 
 * 
 * @author edisoncor
 */
public class Factorial {
    
    private Integer resultado;
    private Integer numero;

    public Factorial(Integer numero) {
        this.numero = numero;
        resultado = this.calcularR(numero);
    }
    
    private Integer calcularR(Integer numero){
        if (numero == 1) {
            return 1;
        }
        return numero * calcularR(numero - 1);
    }
    
    private void calcular(){
        resultado = 1;
        for (int i = numero; i > 1; i--) {
            resultado = resultado * i; 
        }
    }
    
    public Integer getResultado() {
        return resultado;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    
     
}
