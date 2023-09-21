/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_factura_com;

/**
 *
 * @author Ramc
 */
public interface Det_factura_ven_dao {
    void guardar(Det_factura_com detfactura);
    void actualizar(Det_factura_com detfactura);
    void eliminar (int id);
    List<Det_factura_com> list();
    Det_factura_com buscarPorId(int id);
}
