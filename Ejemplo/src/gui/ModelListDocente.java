/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.DefaultListModel;
import model.Docente;

/**
 *
 * @author edisoncor
 */
public class ModelListDocente extends DefaultListModel<Docente>{

    public ModelListDocente() {
        addElement(new Docente("Apellido1", "Nombre1"));
        addElement(new Docente("Apellido2", "Nombre2"));
        addElement(new Docente("Apellido3", "Nombre3"));
        addElement(new Docente("Apellido4", "Nombre4"));
        addElement(new Docente("Apellido5", "Nombre5"));
        addElement(new Docente("Apellido6", "Nombre6"));
    }
    
    
    
}
