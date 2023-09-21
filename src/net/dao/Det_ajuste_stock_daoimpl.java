/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_ajuste_stock;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Det_ajuste_stock_daoimpl implements Det_ajuste_stock_dao{
    private final Session st;

    public Det_ajuste_stock_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Det_ajuste_stock detajuste) {
       st.beginTransaction();
       st.persist(detajuste);
       st.getTransaction().commit();
    }
    
    @Override
    public void actualizar(Det_ajuste_stock detajuste) {
       st.beginTransaction();
       st.persist(detajuste);
       st.getTransaction().commit();
    }
    
    @Override
    public void eliminar(int id) {
    
        Det_ajuste_stock detajuste = buscarPorId(id);
        st.beginTransaction();
        st.delete(detajuste);
        st.getTransaction().commit();
       
    }

    @Override
    public List<Det_ajuste_stock> list() {
       return st.createQuery("FROM Det_ajuste_stock dt").list();
    }

    @Override
    public Det_ajuste_stock buscarPorId(int id) {
        return (Det_ajuste_stock) st.load(Det_ajuste_stock.class, id);
    }
    
}
