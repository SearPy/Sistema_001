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

/**
 *
 * @author Ramc
 */
@Entity
public class Libroiva implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private Calendar fecha;
    private int iva10;
    private int iva5;
    private String tipo;
    @ManyToOne
    private Factura_com id_fac;
    @ManyToOne
    private Nota_credito id_nc;

    public Libroiva() {
    }

    public Libroiva(Calendar fecha, int iva10, int iva5, String tipo, Factura_com id_fac, Nota_credito id_nc) {
        this.fecha = fecha;
        this.iva10 = iva10;
        this.iva5 = iva5;
        this.tipo = tipo;
        this.id_fac = id_fac;
        this.id_nc = id_nc;
    }

    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    public int getId() {
        return id;
    }

   
    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public int getIva10() {
        return iva10;
    }

    public void setIva10(int iva10) {
        this.iva10 = iva10;
    }

    public int getIva5() {
        return iva5;
    }

    public void setIva5(int iva5) {
        this.iva5 = iva5;
    }

    public Factura_com getId_fac() {
        return id_fac;
    }

    public void setId_fac(Factura_com id_fac) {
        this.id_fac = id_fac;
    }

    public Nota_credito getId_nc() {
        return id_nc;
    }

    public void setId_nc(Nota_credito id_nc) {
        this.id_nc = id_nc;
    }
    
    
    
}
