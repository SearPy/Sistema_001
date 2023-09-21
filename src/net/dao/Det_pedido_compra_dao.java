/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_pedido_compra;

/**
 *
 * @author Ramc
 */
public interface Det_pedido_compra_dao {
    void guardar(Det_pedido_compra detpedido);
    List<Det_pedido_compra> list();
    Det_pedido_compra buscarPorId(int id);
}
