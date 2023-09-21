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
public class Det_control_calidad implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private int aceptados;
    private int rechazados;
    private String justificacion;
    @ManyToOne
    private Producto id_pro;
    @ManyToOne
    private Control_calidad id_con;

    public Det_control_calidad() {
    }

    public Det_control_calidad(int aceptados, int rechazados, String justificacion, Producto id_pro, Control_calidad id_con) {
        this.aceptados = aceptados;
        this.rechazados = rechazados;
        this.justificacion = justificacion;
        this.id_pro = id_pro;
        this.id_con = id_con;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    

    public int getId() {
        return id;
    }


    public int getAceptados() {
        return aceptados;
    }

    public void setAceptados(int aceptados) {
        this.aceptados = aceptados;
    }

    public int getRechazados() {
        return rechazados;
    }

    public void setRechazados(int rechazados) {
        this.rechazados = rechazados;
    }

    public Producto getId_pro() {
        return id_pro;
    }

    public void setId_pro(Producto id_pro) {
        this.id_pro = id_pro;
    }

    public Control_calidad getId_con() {
        return id_con;
    }

    public void setId_con(Control_calidad id_con) {
        this.id_con = id_con;
    }
    
    
    
}
