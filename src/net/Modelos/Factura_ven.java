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
public class Factura_ven implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_fac;
    private String timbrado;
    private String factura;
    private Calendar fecha;
    private String tipo;
    private int total;
    private int totaliva10;
    private int totaliva5;
    private String estado;
    private String pagado;
    @ManyToOne
    private Cliente id_prov;
    @ManyToOne
    private Usuario id_us;
    
    @OneToMany(mappedBy = "id_fac", cascade = CascadeType.ALL)
    private List<Det_factura_ven> detalles = new ArrayList<>();

    public Factura_ven() {
    }

    public Factura_ven(String timbrado, String factura, Calendar fecha,  String tipo, int total, int totaliva10, int totaliva5, String estado, String pagado, Cliente id_prov, Usuario id_us) {
        this.timbrado = timbrado;
        this.factura = factura;
        this.fecha = fecha;
        this.tipo = tipo;
        this.total = total;
        this.totaliva10 = totaliva10;
        this.totaliva5 = totaliva5;
        this.estado = estado;
        this.pagado = pagado;
        this.id_prov = id_prov;
        this.id_us = id_us;
    }


    public int getId_fac() {
        return id_fac;
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

    public Cliente getId_prov() {
        return id_prov;
    }

    public void setId_prov(Cliente id_prov) {
        this.id_prov = id_prov;
    }

    public Usuario getId_us() {
        return id_us;
    }

    public void setId_us(Usuario id_us) {
        this.id_us = id_us;
    }

    public List<Det_factura_ven> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Det_factura_ven> detalles) {
        this.detalles = detalles;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

   
    
}
