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
public class Det_presupuesto_prod implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cantidad;
    private int precio;
    @ManyToOne
    private presupuesto_prod id_pres;
    @ManyToOne
    private Producto id_prod;

    public Det_presupuesto_prod() {
    }

    public Det_presupuesto_prod(int cantidad, int precio, presupuesto_prod id_pres, Producto id_prod) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_pres = id_pres;
        this.id_prod = id_prod;
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


    public presupuesto_prod getId_pres() {
        return id_pres;
    }

    public void setId_pres(presupuesto_prod id_pres) {
        this.id_pres = id_pres;
    }

    public Producto getId_prod() {
        return id_prod;
    }

    public void setId_prod(Producto id_prod) {
        this.id_prod = id_prod;
    }

       
}
