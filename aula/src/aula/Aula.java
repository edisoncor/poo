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
        
        Estudiante estudiante = new Estudiante("Jose", "Guaman");
        Estudiante estudiante2 = new Estudiante("Ecuatoriana", "Jose", "Pardo");
        
        Docente docente = new Docente(40, "Edison", "Coronel");
        Docente docente2 = new Docente(40, "Juan", "Perez");
        Docente docente3 = new Docente(40, "María", "Carrión");
        
        Ciclo ciclo2 = new Ciclo(2, computacion);
        
        Asignatura poo = new Asignatura("Programación Orientada a objetos", ciclo2);
        Asignatura disenio = new Asignatura("Diseño de circuitos", ciclo2);
        Asignatura analisis = new Asignatura("Análisis matemático", ciclo2);
        
 
        
        Unidad unidad = new Unidad("Clases y objetos");   
        poo.getUnidadList().add(unidad);
        
        Componente componente1 = new Componente("Actividad Práctica Experimental");
        Componente componente2 = new Componente("Actividad autónoma");
        Componente componente3 = new Componente("Actividad Contacto con el Docente");
        
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
        
        
        Docente d = new Docente("Edison", "Coronel");
        d.setApellido("Coronel Romero");
        d.setNombre("Edison L");
        
        Paralelo pa = new Paralelo("A");
        Paralelo pb = new Paralelo("B");
        Paralelo pc = new Paralelo("C");
        
        Asignacion as = new Asignacion(docente, pa, poo);
        Asignacion as2 = new Asignacion(docente2, pb, poo);
        Asignacion as3 = new Asignacion(docente2, pb, analisis);
        Asignacion as4 = new Asignacion(docente3, pc, poo);
 
        Matricula m = new Matricula(123, estudiante);
        m.getAsignacionList().add(as2);
        m.getAsignacionList().add(as3);
        System.out.println(m);
        
    }
    
}
