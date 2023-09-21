/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Orden_com;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Orden_com_daoimpl implements Orden_com_dao{
    
    private final Session st;

    public Orden_com_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Orden_com orden) {
       st.beginTransaction();
       st.persist(orden);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Orden_com orden) {
       st.beginTransaction();
       st.persist(orden);
       st.getTransaction().commit();
    }

    @Override
    public List<Orden_com> list() {
       return st.createQuery("FROM Orden_com pe").list(); 
    }

    @Override
    public Orden_com buscarPorId(int id) {
        return (Orden_com) st.load(Orden_com.class, id);
    }
    
}
