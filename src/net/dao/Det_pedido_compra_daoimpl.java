/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_pedido_compra;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Det_pedido_compra_daoimpl implements Det_pedido_compra_dao{
    private final Session st;

    public Det_pedido_compra_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Det_pedido_compra detpedido) {
       st.beginTransaction();
       st.persist(detpedido);
       st.getTransaction().commit();
    }

    @Override
    public List<Det_pedido_compra> list() {
       return st.createQuery("FROM Det_pedido_compra dt").list();
    }

    @Override
    public Det_pedido_compra buscarPorId(int id) {
        return (Det_pedido_compra) st.load(Det_pedido_compra.class, id);
    }
    
}
