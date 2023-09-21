/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Ajuste_stock;

/**
 *
 * @author Ramc
 */
public interface Ajuste_stock_dao {
    void guardar(Ajuste_stock ajuste);
    void actualizar(Ajuste_stock ajuste);
    List<Ajuste_stock> list();
    Ajuste_stock buscarPorId(int id);
}
