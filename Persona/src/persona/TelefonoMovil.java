/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import persona.Persona.Direccion;

/**
 *
 * @author edisoncor
 */
public class TelefonoMovil extends DispositivoElectronico implements Contrato{

    
    @Override
    public void contestar() {
        System.out.println("Contestar Movil");
    }

    @Override
    public void llamar() {
        System.out.println("Llamar movil");
    }
    
}
