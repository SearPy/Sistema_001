/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.Modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Ramc
 */
@Entity
public class Producto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_prod;
    private String descripcion;
    private String tipo;
    private int precio;
    private String iva;
    private int stock;

    public Producto() {
    }

    public Producto(int id_prod, String descripcion, String tipo, int precio, String iva, int stock) {
        this.id_prod = id_prod;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.iva = iva;
        this.stock = stock;
    }
    
    

    public Producto(String descripcion, String tipo, int precio, String iva, int stock) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.iva = iva;
        this.stock = stock;
    }

    public int getId_prod() {
        return id_prod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
