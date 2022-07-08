/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.gui;

import javax.swing.DefaultListModel;
import libreria.dao.DAOLibro;
import libreria.model.Libro;

/**
 *
 * @author edisoncor
 */
public class ModelListLibro extends DefaultListModel<Libro>{

    public ModelListLibro() {
         DAOLibro dAOLibro = new DAOLibro();
         addAll(dAOLibro.getList());
    }
    
    
    
}
