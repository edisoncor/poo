/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion;

import java.util.List;

/**
 *
 * @author edisoncor
 */
public class Cliente extends Persona{
    
    private List<Factura> facturaList;
    private Direccion direccion;

    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }
    
    
    
}
