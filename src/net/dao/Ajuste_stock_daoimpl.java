/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Ajuste_stock;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Ajuste_stock_daoimpl implements Ajuste_stock_dao{
    
    private final Session st;

    public Ajuste_stock_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Ajuste_stock ajuste) {
       st.beginTransaction();
       st.persist(ajuste);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Ajuste_stock ajuste) {
       st.beginTransaction();
       st.persist(ajuste);
       st.getTransaction().commit();
    }

    @Override
    public List<Ajuste_stock> list() {
       return st.createQuery("FROM Ajuste_stock pe").list(); 
    }

    @Override
    public Ajuste_stock buscarPorId(int id) {
        return (Ajuste_stock) st.load(Ajuste_stock.class, id);
    }
    
}
