/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.Modelos;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Searp
 */
@Entity
public class Diagnostico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_diag;
    private Calendar fecha;
    private String estadodisp;
    private String acciones;
    private String problemas;
    private String recomendaciones;
    private Usuario usuario;
    @ManyToOne
    private Recepcion recepcion;
    private String estado;

    public Diagnostico() {
    }

    public Diagnostico(Calendar fecha, String estadodisp, String acciones, String problemas, String recomendaciones, Usuario usuario, Recepcion recepcion, String estado) {
        this.fecha = fecha;
        this.estadodisp = estadodisp;
        this.acciones = acciones;
        this.problemas = problemas;
        this.recomendaciones = recomendaciones;
        this.usuario = usuario;
        this.recepcion = recepcion;
        this.estado = estado;
    }

    public int getId_diag() {
        return id_diag;
    }


    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getEstadodisp() {
        return estadodisp;
    }

    public void setEstadodisp(String estadodisp) {
        this.estadodisp = estadodisp;
    }

    public String getAcciones() {
        return acciones;
    }

    public void setAcciones(String acciones) {
        this.acciones = acciones;
    }

    public String getProblemas() {
        return problemas;
    }

    public void setProblemas(String problemas) {
        this.problemas = problemas;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Recepcion getRecepcion() {
        return recepcion;
    }

    public void setRecepcion(Recepcion recepcion) {
        this.recepcion = recepcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

   
    
}
