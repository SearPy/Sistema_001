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

/**
 *
 * @author Searp
 */
@Entity
public class Recepcion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_rec;
    private Calendar fecha;
    private String tipo;
    private String marca;
    private String modelo;
    private String color;
    private String observaciones;
    private Usuario usuario;
    private Cliente cliente;
    private String estado;

    public Recepcion() {
    }

    public Recepcion(Calendar fecha, String tipo, String marca, String modelo, String color, String observaciones, Usuario usuario, Cliente cliente, String estado) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.observaciones = observaciones;
        this.usuario = usuario;
        this.cliente = cliente;
        this.estado = estado;
    }

    public int getId_rec() {
        return id_rec;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    
}
