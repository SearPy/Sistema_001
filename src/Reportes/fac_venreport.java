/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

/**
 *
 * @author Ramc
 */
public class fac_venreport {
    private String cantidad;
    private String codigo;
    private String descripcion;
    private String precio;
    private String total;

    public fac_venreport(String cantidad, String codigo, String descripcion, String precio, String total) {
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.total = total;
    }

    public fac_venreport(String cantidad, String codigo, String descripcion) {
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    
    
}
