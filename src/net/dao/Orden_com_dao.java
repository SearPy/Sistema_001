/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Orden_com;

/**
 *
 * @author Ramc
 */
public interface Orden_com_dao {
    void guardar(Orden_com orden);
    void actualizar(Orden_com orden);
    List<Orden_com> list();
    Orden_com buscarPorId(int id);
}
