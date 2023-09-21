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
public class Cobros implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cobro;
    private String cheque;
    private String banco;
    private int montocheque;
    private String marca;
    private String comprobante;
    private int montotarjeta;
    private int efectivo;
    private int fac;

    public Cobros() {
    }

    public Cobros(String cheque, String banco, int montocheque, String marca, String comprobante, int montotarjeta, int efectivo, int fac) {
        this.cheque = cheque;
        this.banco = banco;
        this.montocheque = montocheque;
        this.marca = marca;
        this.comprobante = comprobante;
        this.montotarjeta = montotarjeta;
        this.efectivo = efectivo;
        this.fac = fac;
    }

    public int getId_cobro() {
        return id_cobro;
    }


    public String getCheque() {
        return cheque;
    }

    public void setCheque(String cheque) {
        this.cheque = cheque;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getMontocheque() {
        return montocheque;
    }

    public void setMontocheque(int montocheque) {
        this.montocheque = montocheque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public int getMontotarjeta() {
        return montotarjeta;
    }

    public void setMontotarjeta(int montotarjeta) {
        this.montotarjeta = montotarjeta;
    }

    public int getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }

    public int getFac() {
        return fac;
    }

    public void setFac(int fac) {
        this.fac = fac;
    }
    
    
    
}
