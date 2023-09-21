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
public class Control_calidad implements Serializable{
    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private int id_con;
    private Calendar fecha;
    private String estado;
    @ManyToOne
    private Registro_produccion id_reg;
    @ManyToOne
    private Usuario id_us;
    
    @OneToMany(mappedBy = "id_con", cascade = CascadeType.ALL)
    private List<Det_control_calidad> detalles = new ArrayList<>();

    public Control_calidad() {
    }

    public Control_calidad(Calendar fecha, String estado, Registro_produccion id_reg, Usuario id_us) {
        this.fecha = fecha;
        this.estado = estado;
        this.id_reg = id_reg;
        this.id_us = id_us;
    }

    public int getId_con() {
        return id_con;
    }

    public void setId_con(int id_con) {
        this.id_con = id_con;
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

    public Registro_produccion getId_reg() {
        return id_reg;
    }

    public void setId_reg(Registro_produccion id_reg) {
        this.id_reg = id_reg;
    }

    public Usuario getId_us() {
        return id_us;
    }

    public void setId_us(Usuario id_us) {
        this.id_us = id_us;
    }

    public List<Det_control_calidad> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Det_control_calidad> detalles) {
        this.detalles = detalles;
    }
    
    
    
}
