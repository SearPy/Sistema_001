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
public class Nota_credito implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_nc;
    private String timbrado;
    private Calendar fecha;
    private String fecha_fac;
    private String tipo;
    private int total;
    private int totaliva10;
    private int totaliva5;
    private String estado;
    private String pagado;
    @ManyToOne
    private Factura_com id_fac;
    @ManyToOne
    private Proveedor id_prov;
    @ManyToOne
    private Usuario id_us;
    
    @OneToMany(mappedBy = "id_nc", cascade = CascadeType.ALL)
    private List<Det_nota_credito> detalles = new ArrayList<>();

    public Nota_credito() {
    }

    public Nota_credito(String timbrado, Calendar fecha, String fecha_fac, String tipo, int total, int totaliva10, int totaliva5, String estado, String pagado, Factura_com id_fac, Proveedor id_prov, Usuario id_us) {
        this.timbrado = timbrado;
        this.fecha = fecha;
        this.fecha_fac = fecha_fac;
        this.tipo = tipo;
        this.total = total;
        this.totaliva10 = totaliva10;
        this.totaliva5 = totaliva5;
        this.estado = estado;
        this.pagado = pagado;
        this.id_fac = id_fac;
        this.id_prov = id_prov;
        this.id_us = id_us;
    }

    public String getTimbrado() {
        return timbrado;
    }

    public void setTimbrado(String timbrado) {
        this.timbrado = timbrado;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getFecha_fac() {
        return fecha_fac;
    }

    public void setFecha_fac(String fecha_fac) {
        this.fecha_fac = fecha_fac;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotaliva10() {
        return totaliva10;
    }

    public void setTotaliva10(int totaliva10) {
        this.totaliva10 = totaliva10;
    }

    public int getTotaliva5() {
        return totaliva5;
    }

    public void setTotaliva5(int totaliva5) {
        this.totaliva5 = totaliva5;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPagado() {
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    public Proveedor getId_prov() {
        return id_prov;
    }

    public void setId_prov(Proveedor id_prov) {
        this.id_prov = id_prov;
    }

    public Usuario getId_us() {
        return id_us;
    }

    public void setId_us(Usuario id_us) {
        this.id_us = id_us;
    }

    public int getId_nc() {
        return id_nc;
    }


    public Factura_com getId_fac() {
        return id_fac;
    }

    public void setId_fac(Factura_com id_fac) {
        this.id_fac = id_fac;
    }

    public List<Det_nota_credito> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Det_nota_credito> detalles) {
        this.detalles = detalles;
    }

    

    
    
    
    
}
