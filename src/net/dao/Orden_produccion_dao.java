/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Orden_produccion;

/**
 *
 * @author Ramc
 */
public interface Orden_produccion_dao {
    void guardar(Orden_produccion orden);
    void actualizar(Orden_produccion orden);
    List<Orden_produccion> list();
    Orden_produccion buscarPorId(int id);
}
