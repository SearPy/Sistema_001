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
public class Inventario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_inv;
    private Calendar fecha;
    private String Estado;
    @ManyToOne
    private Usuario usuarioid;
    
    @OneToMany(mappedBy = "id_inv", cascade = CascadeType.ALL)
    private List<Det_inventario> detalles = new ArrayList<>();

    public Inventario() {
    }

    public Inventario(Calendar fecha, String Estado, Usuario usuarioid) {
        this.fecha = fecha;
        this.Estado = Estado;
        this.usuarioid = usuarioid;
    }

    public int getId_inv() {
        return id_inv;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Usuario getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(Usuario usuarioid) {
        this.usuarioid = usuarioid;
    }

    public List<Det_inventario> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Det_inventario> detalles) {
        this.detalles = detalles;
    }
    
    
    
}
