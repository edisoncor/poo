/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author edisoncor
 */
class TelefonoFijo extends DispositivoElectronico implements Contrato{
    
    private Extension extension;
    
    public void buscarNumero(Agenda agenda){
       
    }

    @Override
    public void contestar() {
        System.out.println("Contestar Fijo");
    }

    @Override
    public void llamar() {
        System.out.println("llamar fijo");
    }
    
}
