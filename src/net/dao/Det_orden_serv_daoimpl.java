/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_orden_serv;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Det_orden_serv_daoimpl implements Det_orden_serv_dao{
    private final Session st;

    public Det_orden_serv_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Det_orden_serv detorden) {
       st.beginTransaction();
       st.persist(detorden);
       st.getTransaction().commit();
    }
    
    @Override
    public void actualizar(Det_orden_serv detorden) {
       st.beginTransaction();
       st.persist(detorden);
       st.getTransaction().commit();
    }
    
    @Override
    public void eliminar(int id) {
    
        Det_orden_serv detorden = buscarPorId(id);
        st.beginTransaction();
        st.delete(detorden);
        st.getTransaction().commit();
       
    }

    @Override
    public List<Det_orden_serv> list() {
       return st.createQuery("FROM Det_orden_serv dt").list();
    }

    @Override
    public Det_orden_serv buscarPorId(int id) {
        return (Det_orden_serv) st.load(Det_orden_serv.class, id);
    }
    
}
