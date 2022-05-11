/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzeria;

/**
 *
 * @author edisoncor
 */
public class Cliente extends Persona{
    
    //atributos
    
    
    //asociaciones
    public Menu[] menuList;
    public TarjetaCredito[] tarjetaCreditoList;
    
    //operaciones o métodos
    public void generarPediso(){
        System.out.println("Pedido generado");
    }
    
}
