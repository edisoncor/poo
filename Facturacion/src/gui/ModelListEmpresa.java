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
      
        
        e1.getFacturaList().add(new Factura("1", e1));
        e1.getFacturaList().add(new Factura("2", e1));
        e2.getFacturaList().add(new Factura("3", e2));
       
        
        addElement(e1);
        addElement(e2);
        
    }
    
    public void agregarEmpresa(Empresa empresa){
        addElement(empresa);
    }
    
    
    
}
