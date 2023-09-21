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
public class Det_orden_serv implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cantidad;
    private int precio;
    @ManyToOne
    private Producto id_prod;
    @ManyToOne
    private Orden_serv id_ord;

    public Det_orden_serv() {
    }

    public Det_orden_serv(int cantidad, int precio, Producto id_prod, Orden_serv id_ord) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_prod = id_prod;
        this.id_ord = id_ord;
    }

    public int getId() {
        return id;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Producto getId_prod() {
        return id_prod;
    }

    public void setId_prod(Producto id_prod) {
        this.id_prod = id_prod;
    }

    public Orden_serv getId_ord() {
        return id_ord;
    }

    public void setId_ord(Orden_serv id_ord) {
        this.id_ord = id_ord;
    }
    
    
}
