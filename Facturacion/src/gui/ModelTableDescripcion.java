/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Descripcion;

/**
 *
 * @author edisoncor
 */
public class ModelTableDescripcion extends DefaultTableModel{

    private List<Descripcion> descricionList;
    
    public ModelTableDescripcion() {
        descricionList = new LinkedList<>();
        addColumn("Cantidad");
        addColumn("Producto");
        addColumn("Precio Unitario");
        addColumn("Valor Total");
        
        addRow(new String[]{"2", "Termo", "3,0", "5,0"});
    }
    
    public void agregarDescripcion(Descripcion descripcion){
        descricionList.add(descripcion);
        addRow(new Object[]{
            descripcion.getCantidad(),
            descripcion.getProducto(),
            descripcion.getPrecioUnitario(),
            descripcion.getValorTotal()
        });
    }
    
    
    
}
