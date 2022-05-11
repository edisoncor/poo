/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeria;

/**
 *
 * @author edisoncor
 */
public class Menu {
    
    //atributos
    
   
    
    // asociación
    public Registro[] registroList;
    public OtroRegistro[] otroRegistroList;
    public Cliente cliente;

    public Menu() {
        registroList = new Registro[2];
        otroRegistroList = new OtroRegistro[2];
    }
 
    // operaciones y métodos
    
    
    public class Registro {
        
        public Menu menu;
    }
}
