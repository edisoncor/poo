/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author edisoncor
 */
public class Factura {
 
    private String fecha;
    private String numero;
    private Float subTotal;
    private Float total;
    private Float valorIva;

    private Empleado empleado;
    private Cliente cliente;
    private Empresa empresa;
    
    private List<Descripcion> descripcionList;

    public Factura() {
        descripcionList = new LinkedList<>();
    }
    
    public void calcularIVA(){
        this.valorIva = this.subTotal * this.empresa.getPorcentajeIVA() / 100;
    }
    
    public void calcularSubTotal(){
        this.subTotal = 0f;
        for (Descripcion descripcion : descripcionList) {
            this.subTotal += descripcion.getValorTotal();
        }
    }
    
    public void calcularTotal(){
        this.total = this.subTotal + this.valorIva;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Float getSubTotal() {
        return subTotal;
    }

    public Float getTotal() {
        return total;
    }

    public Float getValorIva() {
        return valorIva;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Descripcion> getDescripcionList() {
        return descripcionList;
    }

    public void setDescripcionList(List<Descripcion> descripcionList) {
        this.descripcionList = descripcionList;
    }
    
    
    
}
