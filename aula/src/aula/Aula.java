/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula;

/**
 *
 * @author edisoncor
 */
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Universidad universidad; //declarando un objeto
        universidad = new Universidad("Universidad Nacional de Loja", "UNL");
        System.out.println(universidad);
        Universidad universidad2 = new Universidad("Universidad Técnica Particular de Loja");
        System.out.println(universidad2);
        Universidad universidad3 = new Universidad("Universidad Central del Ecuadro", "UCE");
        System.out.println(universidad3);
    }
    
}
