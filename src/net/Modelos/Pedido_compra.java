/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.Modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Ramc
 */
@Entity
public class Pedido_compra implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ped;
    private Calendar fecha;
    private String estado;
    @ManyToOne
    private Usuario usuarioid;
    
    @OneToMany(mappedBy = "id_ped", cascade = CascadeType.ALL)
    private List<Det_pedido_compra> detalles = new ArrayList<>();

    public Pedido_compra() {
    }

    public Pedido_compra(Calendar fecha, String estado, Usuario usuarioid) {
        this.fecha = fecha;
        this.estado = estado;
        this.usuarioid = usuarioid;
    }

    

    public int getId_ped() {
        return id_ped;
    }


    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public Usuario getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(Usuario usuarioid) {
        this.usuarioid = usuarioid;
    }

    public List<Det_pedido_compra> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Det_pedido_compra> detalles) {
        this.detalles = detalles;
    }
    
    
    
}
