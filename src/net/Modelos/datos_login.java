/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.Modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author RAMC
 */
@Entity
public class datos_login implements Serializable{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Usuario id_usu;
    private Date fecha;
    private Boolean estado;
    private String maquina;

    public datos_login() {
    }

    public datos_login(Usuario id_usu, Date fecha, Boolean estado, String maquina) {
        this.id_usu = id_usu;
        this.fecha = fecha;
        this.estado = estado;
        this.maquina = maquina;
    }

    public int getId() {
        return id;
    }

    public Usuario getUsuario() {
        return id_usu;
    }

    public void setUsuario(Usuario id_usu) {
        this.id_usu = id_usu;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }
    
    
}
