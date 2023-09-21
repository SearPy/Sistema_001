/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Costo_produccion;

/**
 *
 * @author Ramc
 */
public interface Costo_produccion_dao {
    void guardar(Costo_produccion presupuesto);
    void actualizar(Costo_produccion presupuesto);
    List<Costo_produccion> list();
    Costo_produccion buscarPorId(int id);
}
