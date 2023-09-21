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
 * @author Ramc
 */
@Entity
public class Caja implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_caja;
    private Calendar fechaini;
    private Calendar fechacie;
    private int cheque;
    private int tarjeta;
    private int efectivo;
    private int montoini;
    private int montocie;
    private int d100;
    private int d50;
    private int d20;
    private int d10;
    private int d5;
    private int d2;
    private int d1;
    private int d05;
    private String estado;
    private Usuario usuario;

    public Caja() {
    }

    public Caja(Calendar fechaini, int montoini , int cheque, int tarjeta, int efectivo, String estado, Usuario usuario) {
        this.fechaini = fechaini;
        this.montoini = montoini;
        this.cheque = cheque;
        this.tarjeta = tarjeta;
        this.efectivo = efectivo;
        this.estado = estado;
        this.usuario = usuario;
    }

    

    public Caja(int cheque, int tarjeta, int efectivo) {
        this.cheque = cheque;
        this.tarjeta = tarjeta;
        this.efectivo = efectivo;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public int getD2() {
        return d2;
    }

    public void setD2(int d2) {
        this.d2 = d2;
    }

    public int getD05() {
        return d05;
    }

    public void setD05(int d05) {
        this.d05 = d05;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    

    public int getId_caja() {
        return id_caja;
    }

    public Calendar getFechaini() {
        return fechaini;
    }

    public void setFechaini(Calendar fechaini) {
        this.fechaini = fechaini;
    }

    public Calendar getFechacie() {
        return fechacie;
    }

    public void setFechacie(Calendar fechacie) {
        this.fechacie = fechacie;
    }

    public int getMontoini() {
        return montoini;
    }

    public void setMontoini(int montoini) {
        this.montoini = montoini;
    }

    public int getMontocie() {
        return montocie;
    }

    public void setMontocie(int montocie) {
        this.montocie = montocie;
    }

    public int getD100() {
        return d100;
    }

    public void setD100(int d100) {
        this.d100 = d100;
    }

    public int getD50() {
        return d50;
    }

    public void setD50(int d50) {
        this.d50 = d50;
    }

    public int getD20() {
        return d20;
    }

    public void setD20(int d20) {
        this.d20 = d20;
    }

    public int getD10() {
        return d10;
    }

    public void setD10(int d10) {
        this.d10 = d10;
    }

    public int getD5() {
        return d5;
    }

    public void setD5(int d5) {
        this.d5 = d5;
    }

    public int getD1() {
        return d1;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public int getCheque() {
        return cheque;
    }

    public void setCheque(int cheque) {
        this.cheque = cheque;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }
    
    

    
    
}
