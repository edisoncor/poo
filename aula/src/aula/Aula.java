/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula;


/**
 *
 * @author edisoncor
 */
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Universidad universidad; //declarando un objeto
        universidad = new Universidad("Univeridad Nacional de Loja", "UNL");
        
        Facultad facultad = new Facultad("Energia");
        
        Carrera computacion = new Carrera("Computación");
        Carrera sistemas = new Carrera("Sistemas");
        
        Estudiante estudiante = new Estudiante("Juan", "Perez");
        Estudiante estudiante2 = new Estudiante("Ecuatoriana", "Jose", "Pardo");
        
        Docente docente = new Docente(40, "Edison", "Coronel");
        
        Asignatura poo = new Asignatura();
        
        Unidad unidad = new Unidad("Clases y objetos");
        
        Componente componente = new Componente("Actividad Práctica Experimental");
        
//        ======================================================================
        
        universidad.setNombre("Universidad Nacional de Loja");
        universidad.getFacultadList().add(facultad);
        facultad.setUniversidad(universidad);
        facultad.getCarreraList().add(sistemas);
        facultad.getCarreraList().add(computacion);
        sistemas.setFacultad(facultad);
        computacion.setFacultad(facultad);
        computacion.getCicloList().add(new Ciclo(1, computacion));
        computacion.getCicloList().add(new Ciclo(2, computacion));
        computacion.getCicloList().add(new Ciclo(3, computacion));
        computacion.getCicloList().add(new Ciclo(4, computacion));
        computacion.getCicloList().add(new Ciclo(5));
        computacion.getCicloList().add(new Ciclo(6));
        computacion.getCicloList().add(new Ciclo(7));
        computacion.getCicloList().add(new Ciclo(8));
        computacion.getCicloList().add(new Ciclo(9));
        
        
        computacion.getFacultad().getUniversidad().setNombre("Nuevo nombre");
        
        System.out.println(universidad);
        System.out.println(universidad.getFacultadList().get(0).getCarreraList().get(1).getCicloList().get(1));
        
        Docente d = new Docente("Edison", "Coronel");
        System.out.println(d);
        d.setApellido("Coronel Romero");
        d.setNombre("Edison L");
        System.out.println(d);
       
        
    }
    
}
