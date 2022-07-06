/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria.gui;

import libreria.model.Computador;
import libreria.model.Libro;
import libreria.dao.DAOLibro;
import libreria.dao.DAOComputador;

/**
 *
 * @author edisoncor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setAutor("Sommerville");
        libro.setNombre("Ingenieria del Software");
        
        DAOLibro dAOLibro = new DAOLibro();
        dAOLibro.guardar(libro);
        
        
        DAOComputador dAOComputador = new DAOComputador();
        dAOComputador.guardarOActualizar(new Computador(1, "Samsung", "i9", 30f));
        
        
    }
    
}
