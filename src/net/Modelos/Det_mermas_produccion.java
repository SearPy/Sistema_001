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
public class Det_mermas_produccion implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private int cantidad;
    private String observacion;
    @ManyToOne
    private Producto id_prod;
    @ManyToOne 
    Mermas_produccion id_mer;

    public Det_mermas_produccion() {
    }

    public Det_mermas_produccion(int cantidad, String observacion, Producto id_prod, Mermas_produccion id_mer) {
        this.cantidad = cantidad;
        this.observacion = observacion;
        this.id_prod = id_prod;
        this.id_mer = id_mer;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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

    public Producto getId_prod() {
        return id_prod;
    }

    public void setId_prod(Producto id_prod) {
        this.id_prod = id_prod;
    }

    public Mermas_produccion getId_mer() {
        return id_mer;
    }

    public void setId_mer(Mermas_produccion id_mer) {
        this.id_mer = id_mer;
    }
    
    
}
