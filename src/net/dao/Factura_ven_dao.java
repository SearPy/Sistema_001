/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Factura_ven;

/**
 *
 * @author Ramc
 */
public interface Factura_ven_dao {
    void guardar(Factura_ven factura);
    void actualizar(Factura_ven factura);
    List<Factura_ven> list();
    Factura_ven buscarPorId(int id);
}
