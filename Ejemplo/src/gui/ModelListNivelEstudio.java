/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.DefaultListModel;
import model.Estudiante;

/**
 *
 * @author edisoncor
 */
public class ModelListNivelEstudio extends DefaultListModel<Estudiante.NivelEstudio>{

    public ModelListNivelEstudio() {
        addElement(Estudiante.NivelEstudio.PRIMARIO);
        addElement(Estudiante.NivelEstudio.SECUNDARIO);
        addElement(Estudiante.NivelEstudio.TERCER_NIVEL);
        addElement(Estudiante.NivelEstudio.CUARTO_NIVEL);
    }
    
    
    
}
