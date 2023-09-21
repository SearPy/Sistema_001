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
public class Servicios implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ord;
    private Calendar fecha;
    private String estado;
    @ManyToOne
    private Orden_serv id_pres;
    @ManyToOne
    private Cliente id_prov;
    @ManyToOne
    private Usuario id_us;
    
    @OneToMany(mappedBy = "id_ord", cascade = CascadeType.ALL)
    private List<Det_servicios> detalles = new ArrayList<>();

    public Servicios() {
    }

    public Servicios(Calendar fecha, String estado, Orden_serv id_pres, Cliente id_prov, Usuario id_us) {
        this.fecha = fecha;
        this.estado = estado;
        this.id_pres = id_pres;
        this.id_prov = id_prov;
        this.id_us = id_us;
    }

    public int getId_ord() {
        return id_ord;
    }


    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Orden_serv getId_pres() {
        return id_pres;
    }

    public void setId_pres(Orden_serv id_pres) {
        this.id_pres = id_pres;
    }

    public Cliente getId_prov() {
        return id_prov;
    }

    public void setId_prov(Cliente id_prov) {
        this.id_prov = id_prov;
    }

    public Usuario getId_us() {
        return id_us;
    }

    public void setId_us(Usuario id_us) {
        this.id_us = id_us;
    }

    public List<Det_servicios> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Det_servicios> detalles) {
        this.detalles = detalles;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
