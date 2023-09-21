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
public class Det_registro_produccion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_det;
    private int cantidad;
    private int precio;
    @ManyToOne
    private Producto id_prod;
    @ManyToOne
    private Registro_produccion id_ord;

    public Det_registro_produccion() {
    }

    public Det_registro_produccion(int cantidad, int precio, Producto id_prod, Registro_produccion id_ord) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_prod = id_prod;
        this.id_ord = id_ord;
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

    public int getId_det() {
        return id_det;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Registro_produccion getId_ord() {
        return id_ord;
    }

    public void setId_ord(Registro_produccion id_ord) {
        this.id_ord = id_ord;
    }
    
    
}
