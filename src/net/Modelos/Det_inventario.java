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
import javax.persistence.ManyToOne;

/**
 *
 * @author Ramc
 */
@Entity
public class Det_inventario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Producto id_prod;
    private int cantidad;
    @ManyToOne
    private Inventario id_inv;

    public Det_inventario() {
    }

    public Det_inventario(Producto id_prod, int cantidad, Inventario id_inv) {
        this.id_prod = id_prod;
        this.cantidad = cantidad;
        this.id_inv = id_inv;
    }

    public int getId() {
        return id;
    }

    public Producto getId_prod() {
        return id_prod;
    }

    public void setId_prod(Producto id_prod) {
        this.id_prod = id_prod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Inventario getId_inv() {
        return id_inv;
    }

    public void setId_inv(Inventario id_inv) {
        this.id_inv = id_inv;
    }
    
    
}
