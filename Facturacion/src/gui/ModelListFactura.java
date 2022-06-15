/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.DefaultListModel;
import model.Empresa;
import model.Factura;

/**
 *
 * @author edisoncor
 */
public class ModelListFactura extends DefaultListModel<Factura>{

    public ModelListFactura() {
    }

    public ModelListFactura(Empresa empresa) {  
        addAll(empresa.getFacturaList());
    }
    
    
    
}
