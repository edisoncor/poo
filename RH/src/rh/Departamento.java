/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rh;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author edisoncor
 */
public class Departamento {

    private String nombre;
    
    private List<Servidor> servidorList;
    private Departamento departamento;
    private List<Departamento> departamentoList;

    public Departamento(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarSubDepartamento(Departamento departamento){
        if (this.departamentoList == null)
            this.departamentoList = new LinkedList<>();
        this.departamentoList.add(departamento);
    }
    
    public void agregarServidor(Servidor servidor){
        if (this.servidorList == null)
            this.servidorList = new LinkedList<>();
        this.servidorList.add(servidor);
    }
    
    public void rectificarDatosPersonales(String nuevoApellido, 
            String nuevoNombre, Servidor servidor ){
        
        int index = this.servidorList.indexOf(servidor);
        System.out.println(index);
        Servidor s = this.servidorList.get(index);
        s.rectificarInformacion(nuevoApellido, nuevoNombre);
        this.servidorList.set(index, s);
        System.out.println(s);
//        this.servidorList.get();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombre=" + nombre + ", \n"
                + "departamentoList=" + departamentoList + '}';
    }
    
}
