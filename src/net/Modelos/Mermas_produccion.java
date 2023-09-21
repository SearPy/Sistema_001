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
public class Mermas_produccion implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_mer;
    private Calendar fecha;
    private String estado;
    @ManyToOne
    private Usuario id_us;
    
    @OneToMany(mappedBy = "id_mer", cascade = CascadeType.ALL)
    private List<Det_mermas_produccion> detalles = new ArrayList<>();

    public Mermas_produccion() {
    }

    public Mermas_produccion(Calendar fecha, String estado, Usuario id_us) {
        this.fecha = fecha;
        this.estado = estado;
        this.id_us = id_us;
    }

    public int getId_mer() {
        return id_mer;
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

    public Usuario getId_us() {
        return id_us;
    }

    public void setId_us(Usuario id_us) {
        this.id_us = id_us;
    }

    public List<Det_mermas_produccion> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Det_mermas_produccion> detalles) {
        this.detalles = detalles;
    }
    
    
}
