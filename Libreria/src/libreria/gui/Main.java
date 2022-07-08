/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria.gui;

import libreria.model.Computador;
import libreria.model.Libro;
import libreria.dao.DAOLibro;
import libreria.dao.DAOComputador;
import libreria.dao.DAOHijo;
import libreria.dao.DAOPadre;
import libreria.model.Hijo;
import libreria.model.Padre;

/**
 *
 * @author edisoncor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
////        Libro libro = new Libro();
////        libro.setAutor("Sommerville");
////        libro.setNombre("Ingenieria del Software");
////        
////        DAOLibro dAOLibro = new DAOLibro();
////        dAOLibro.guardar(libro);
////        
////        
////        DAOComputador dAOComputador = new DAOComputador();
////        dAOComputador.guardarOActualizar(new Computador("Samsung", "i9", 30f));
//        
////        System.out.println(dAOLibro.getList());
////        System.out.println(dAOComputador.getList());
        
        Padre padre = new Padre("nombre padre");
        
        
        DAOPadre dAOPadre = new DAOPadre();
//        System.out.println(dAOPadre.guardar(padre));
        padre.setId((int) dAOPadre.guardar(padre));
        
        System.out.println(padre);
        
        
        Padre p = (Padre) dAOPadre.getList().   get(0);
        System.out.println(p);
        
        Hijo hijo = new Hijo("nombre hijo", p);
        DAOHijo dAOHijo = new DAOHijo();
        dAOHijo.guardar(hijo);
        
    }
    
}
