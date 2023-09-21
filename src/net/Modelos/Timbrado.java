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
public class Timbrado implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nro;
    private Calendar validez;
    private int inicial;
    private int actual;

    public Timbrado() {
    }

    public Timbrado(String nro, Calendar validez, int inicial, int actual) {
        this.nro = nro;
        this.validez = validez;
        this.inicial = inicial;
        this.actual = actual;
    }

    public int getId() {
        return id;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public Calendar getValidez() {
        return validez;
    }

    public void setValidez(Calendar validez) {
        this.validez = validez;
    }

    public int getInicial() {
        return inicial;
    }

    public void setInicial(int inicial) {
        this.inicial = inicial;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
    
    

    
}
