/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edisoncor
 */
public class ModelTableProducto extends DefaultTableModel{

    public ModelTableProducto() {
        
        addColumn("Nombre");
        addColumn("Precio de compra");
        addColumn("Stock");
    }
    
    
    
}
