/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
        subTotal = 0f;
        valorIva = 0f;
        total = 0f;
    }

    public Factura(String numero) {
        this();
        this.numero = numero;
    }

    public Factura(String numero, Empresa empresa) {
        this(numero);
        this.empresa = empresa;
    }

    public Factura(String numero, Cliente cliente) {
        this(numero);
        this.cliente = cliente;
    }

    public Factura(String numero, Cliente cliente, Empresa empresa) {
        this(numero, cliente);
        this.empresa = empresa;
    }
    
    public void agregarProducto(Producto producto, Integer cantidad){
        this.descripcionList.add(new Descripcion(cantidad, this, producto));
        calcularSubTotal();
    }
    
    protected void calcularIVA(){
        this.valorIva = this.subTotal * this.empresa.getPorcentajeIVA() / 100;
        this.calcularTotal();
    }
    
    protected void calcularSubTotal(){
        this.subTotal = 0f;
        for (Descripcion descripcion : descripcionList) {
            this.subTotal += descripcion.getValorTotal();
        }
        this.calcularIVA();
    }
    
    protected void calcularTotal(){
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

    @Override
    public String toString() {
        return "Factura{" + "numero=" + numero + '}';
    }
    
    
    
}
