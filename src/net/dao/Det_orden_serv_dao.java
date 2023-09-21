/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_orden_serv;

/**
 *
 * @author Ramc
 */
public interface Det_orden_serv_dao {
    void guardar(Det_orden_serv detorden);
    void actualizar(Det_orden_serv detorden);
    void eliminar (int id);
    List<Det_orden_serv> list();
    Det_orden_serv buscarPorId(int id);
}
