/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facturacion;

/**
 *
 * @author edisoncor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura factura = new Factura();
        Empresa empresa = new Empresa("123", "Tienda de la esquina", "1123001", 12);
        factura.setEmpresa(empresa);
        Producto termo = new Producto("Termo", 10f, 12);
        factura.agregarProducto(termo, 3); 
        System.out.println(factura.getTotal());
        
    }
    
}
