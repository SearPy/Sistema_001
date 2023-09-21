/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_servicios;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Det_servicios_daoimpl implements Det_servicios_dao{
    private final Session st;

    public Det_servicios_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Det_servicios detorden) {
       st.beginTransaction();
       st.persist(detorden);
       st.getTransaction().commit();
    }
    
    @Override
    public void actualizar(Det_servicios detorden) {
       st.beginTransaction();
       st.persist(detorden);
       st.getTransaction().commit();
    }
    
    @Override
    public void eliminar(int id) {
    
        Det_servicios detorden = buscarPorId(id);
        st.beginTransaction();
        st.delete(detorden);
        st.getTransaction().commit();
       
    }

    @Override
    public List<Det_servicios> list() {
       return st.createQuery("FROM Det_servicios dt").list();
    }

    @Override
    public Det_servicios buscarPorId(int id) {
        return (Det_servicios) st.load(Det_servicios.class, id);
    }
    
}
