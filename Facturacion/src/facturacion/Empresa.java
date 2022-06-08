/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion;

import java.util.List;

/**
 *
 * @author edisoncor
 */
public class Empresa {
    
    private String autorizacion;
    private String nombre;
    private String ruc;
    private Integer porcentajeIVA;
    
    private List<Factura> facturaList;
    private Direccion direccion;

    public Empresa(String autoriazacion, String nombre, String ruc) {
        this.autorizacion = autoriazacion;
        this.nombre = nombre;
        this.ruc = ruc;
    }

    public Empresa(String autoriazacion, String nombre, String ruc, Integer porcentajeIVA) {
        this(autoriazacion, nombre, ruc);
        this.porcentajeIVA = porcentajeIVA;
    }
    
    

    public String getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(String autoriazacion) {
        this.autorizacion = autoriazacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public List<Factura> getFacturaList() {
        return facturaList;
    }

    public void setFacturaList(List<Factura> facturaList) {
        this.facturaList = facturaList;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Integer getPorcentajeIVA() {
        return porcentajeIVA;
    }

    public void setPorcentajeIVA(Integer porcentajeIVA) {
        this.porcentajeIVA = porcentajeIVA;
    }
    
    
    
}
