/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.model;

/**
 *
 * @author edisoncor
 */
public class Computador {
 
    private int id;
    
    private String marca;
    private String modelo;
    private Float peso;

    public Computador() {
    }

    public Computador(int id, String marca, String modelo, Float peso) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
    
    
    
}
