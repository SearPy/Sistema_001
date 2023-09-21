/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Pedido_compra;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Pedido_compra_daoimpl implements Pedido_compra_dao{
    
    private final Session st;

    public Pedido_compra_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Pedido_compra pedido) {
       st.beginTransaction();
       st.persist(pedido);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Pedido_compra pedido) {
       st.beginTransaction();
       st.persist(pedido);
       st.getTransaction().commit();
    }

    @Override
    public List<Pedido_compra> list() {
       return st.createQuery("FROM Pedido_compra pe").list(); 
    }

    @Override
    public Pedido_compra buscarPorId(int id) {
        return (Pedido_compra) st.load(Pedido_compra.class, id);
    }
    
}
