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
public class Det_ajuste_stock implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private int cantidad;
    private String observacion;
    @ManyToOne
    private Producto id_pro;
    @ManyToOne
    private Ajuste_stock id_aj;

    public Det_ajuste_stock() {
    }

    public Det_ajuste_stock(int cantidad, String observacion, Producto id_pro, Ajuste_stock id_aj) {
        this.cantidad = cantidad;
        this.observacion = observacion;
        this.id_pro = id_pro;
        this.id_aj = id_aj;
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

    public Producto getId_pro() {
        return id_pro;
    }

    public void setId_pro(Producto id_pro) {
        this.id_pro = id_pro;
    }

    public Ajuste_stock getId_aj() {
        return id_aj;
    }

    public void setId_aj(Ajuste_stock id_aj) {
        this.id_aj = id_aj;
    }
    
    
    
}
