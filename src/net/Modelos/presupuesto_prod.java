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
public class presupuesto_prod implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pres;
    private Calendar fecha;
    private String estado;
    @ManyToOne
    private Usuario usuarioid;
    @ManyToOne
    private Cliente clienteid;
    
    @OneToMany(mappedBy = "id_pres", cascade = CascadeType.ALL)
    private List<Det_presupuesto_prod> detalles = new ArrayList<>();

    public presupuesto_prod() {
    }

    public presupuesto_prod(Calendar fecha, String estado, Usuario usuarioid, Cliente clienteid) {
        this.fecha = fecha;
        this.estado = estado;
        this.usuarioid = usuarioid;
        this.clienteid = clienteid;
    }

    public int getId_pres() {
        return id_pres;
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

    public Cliente getClienteid() {
        return clienteid;
    }

    public void setClienteid(Cliente clienteid) {
        this.clienteid = clienteid;
    }

    public List<Det_presupuesto_prod> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Det_presupuesto_prod> detalles) {
        this.detalles = detalles;
    }
    
    
}
