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
public class Det_nota_credito implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cantidad;
    private int precio;
    @ManyToOne
    private Producto id_prod;
    @ManyToOne
    private Nota_credito id_nc;

    public Det_nota_credito() {
    }

    public Det_nota_credito(int cantidad, int precio, Producto id_prod, Nota_credito id_nc) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_prod = id_prod;
        this.id_nc = id_nc;
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

    public Nota_credito getId_nc() {
        return id_nc;
    }

    public void setId_nc(Nota_credito id_nc) {
        this.id_nc = id_nc;
    }

    
    
    
}
