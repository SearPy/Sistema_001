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
public class Presupuesto_com implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pres;
    private Calendar fecha;
    private String Estado;
    @ManyToOne
    private Pedido_compra id_ped;
    @ManyToOne
    private Usuario id_us;
    @ManyToOne
    private Proveedor id_prov;
    
    @OneToMany(mappedBy = "id_pres", cascade = CascadeType.ALL)
    private List<Det_presupuesto_com> detalles = new ArrayList<>();

    public Presupuesto_com() {
    }

    public Presupuesto_com(Calendar fecha, String Estado, Pedido_compra id_ped, Usuario id_us, Proveedor id_prov) {
        this.fecha = fecha;
        this.Estado = Estado;
        this.id_ped = id_ped;
        this.id_us = id_us;
        this.id_prov = id_prov;
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
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Usuario getId_us() {
        return id_us;
    }

    public void setId_us(Usuario id_us) {
        this.id_us = id_us;
    }

    public Proveedor getId_prov() {
        return id_prov;
    }

    public void setId_prov(Proveedor id_prov) {
        this.id_prov = id_prov;
    }

    public List<Det_presupuesto_com> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Det_presupuesto_com> detalles) {
        this.detalles = detalles;
    }

    public Pedido_compra getId_ped() {
        return id_ped;
    }

    public void setId_ped(Pedido_compra id_ped) {
        this.id_ped = id_ped;
    }
    
    
    
    
    
}
