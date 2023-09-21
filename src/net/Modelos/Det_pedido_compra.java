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
public class Det_pedido_compra implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cantidad;
    @ManyToOne
    private Pedido_compra id_ped;
    @ManyToOne
    private Producto id_prod;

    public Det_pedido_compra() {
    }

    public Det_pedido_compra(int cantidad, Pedido_compra id_ped, Producto id_prod) {
        this.cantidad = cantidad;
        this.id_ped = id_ped;
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

    public Pedido_compra getId_ped() {
        return id_ped;
    }

    public void setId_ped(Pedido_compra id_ped) {
        this.id_ped = id_ped;
    }

    public Producto getId_prod() {
        return id_prod;
    }

    public void setId_prod(Producto id_prod) {
        this.id_prod = id_prod;
    }
    
    
}
