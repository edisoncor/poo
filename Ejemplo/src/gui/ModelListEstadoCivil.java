/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.DefaultComboBoxModel;
import model.EstadoCivil;

/**
 *
 * @author edisoncor
 */
public class ModelListEstadoCivil extends DefaultComboBoxModel<EstadoCivil>{

    public ModelListEstadoCivil() {
        addElement(EstadoCivil.CASADO);
        addElement(EstadoCivil.DIVORCIADO);
        addElement(EstadoCivil.SOLTERO);
        addElement(EstadoCivil.UNION_LIBRE);
        
    }
    
    
}
