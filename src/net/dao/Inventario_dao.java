/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Inventario;

/**
 *
 * @author Ramc
 */
public interface Inventario_dao {
    void guardar(Inventario inventario);
    void actualizar(Inventario inventario);
    List<Inventario> list();
    Inventario buscarPorId(int id);
}
