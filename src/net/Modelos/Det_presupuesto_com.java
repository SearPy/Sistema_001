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
public class Det_presupuesto_com implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cantidad;
    private int precio;
    @ManyToOne
    private Producto id_prod;
    @ManyToOne
    private Presupuesto_com id_pres;

    public Det_presupuesto_com() {
    }

    public Det_presupuesto_com(int cantidad, int precio, Producto id_prod, Presupuesto_com id_pres) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_prod = id_prod;
        this.id_pres = id_pres;
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

    public Presupuesto_com getId_pres() {
        return id_pres;
    }

    public void setId_pres(Presupuesto_com id_pres) {
        this.id_pres = id_pres;
    }
    
    
}
