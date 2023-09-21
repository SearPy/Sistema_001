/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Pedido_compra;

/**
 *
 * @author Ramc
 */
public interface Pedido_compra_dao {
    void guardar(Pedido_compra pedido);
    void actualizar(Pedido_compra pedido);
    List<Pedido_compra> list();
    Pedido_compra buscarPorId(int id);
}
