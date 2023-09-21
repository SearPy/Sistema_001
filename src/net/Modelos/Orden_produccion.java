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
public class Orden_produccion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ord;
    private Calendar fecha;
    private String estado;
    @ManyToOne
    private presupuesto_prod id_pres;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Usuario usuario;
    
    @OneToMany(mappedBy = "id_ord", cascade = CascadeType.ALL)
    private List<Det_orden_produccion> detalles = new ArrayList<>();

    public Orden_produccion() {
    }

    public Orden_produccion(Calendar fecha, String estado, presupuesto_prod id_pres, Cliente cliente, Usuario usuario) {
        this.fecha = fecha;
        this.estado = estado;
        this.id_pres = id_pres;
        this.cliente = cliente;
        this.usuario = usuario;
    }

    

    public presupuesto_prod getId_pres() {
        return id_pres;
    }

    public void setId_pres(presupuesto_prod id_pres) {
        this.id_pres = id_pres;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Det_orden_produccion> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Det_orden_produccion> detalles) {
        this.detalles = detalles;
    }
    
    
}
