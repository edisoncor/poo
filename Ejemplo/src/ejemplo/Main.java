/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;

import model.Docente;


/**
 *
 * @author edisoncor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try {
////            intentar ejecutar el codigo 
//            int i = Integer.parseInt("a1234");
//            System.out.println("El número convertido es=" + i);
//        } catch (Exception e) {
////            agarrar y tratarla en este segmento
//            System.err.println("Error al convertir el numero: " + e) ;
//        }
        
        
        try {
            int j = Integer.parseInt("2341");
            String s;
            s = null;
            System.out.println(s.charAt(j));
            System.out.println("El número convertido es=" + j);
        } catch (NullPointerException e) {
            System.err.println("Error de variable null: " + e) ;
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir el numero " + e);
        }finally {
            System.out.println("Segmento finally");
        }
        
        Docente d = new Docente("Juan", "Perez");
        try {
            d.darClases();
        } catch (UnsupportedOperationException e) {
            System.err.println("Error método aún no implementado");
        }catch (AssertionError e){
            System.err.println("Nunca debio llegar acá");
        }
        
        try {
            d.prepararClases();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
    
}
