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
public class ModelListEmpresa extends DefaultListModel<Empresa>{

    public ModelListEmpresa() {
        
        
        Empresa e1 = new Empresa("123", "Empresa 1", "11023232");
        Empresa e2 = new Empresa("124", "Empresa 2", "11023232");
        Empresa e3 = new Empresa("125", "Empresa 3", "11023232");
        Empresa e4 = new Empresa("126", "Empresa 4", "11023232");
        Empresa e5 = new Empresa("127", "Empresa 5", "11023232");
        Empresa e6 = new Empresa("128", "Empresa 6", "11023232");
        Empresa e7 = new Empresa("129", "Empresa 7", "11023232");
        
        e1.getFacturaList().add(new Factura("1", e1));
        e1.getFacturaList().add(new Factura("2", e1));
        e2.getFacturaList().add(new Factura("3", e2));
        e3.getFacturaList().add(new Factura("4", e3));
        e3.getFacturaList().add(new Factura("5", e3));
        e4.getFacturaList().add(new Factura("6", e4));
        
        addElement(e1);
        addElement(e2);
        addElement(e3);
        addElement(e4);
        addElement(e5);
        addElement(e6);
        addElement(e7);
    }
    
    
    
}
