/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_registro_produccion;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Det_registro_produccion_daoimpl implements Det_registro_produccion_dao{
    private final Session st;

    public Det_registro_produccion_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Det_registro_produccion detorden) {
       st.beginTransaction();
       st.persist(detorden);
       st.getTransaction().commit();
    }
    
    @Override
    public void actualizar(Det_registro_produccion detorden) {
       st.beginTransaction();
       st.persist(detorden);
       st.getTransaction().commit();
    }
    
    @Override
    public void eliminar(int id) {
    
        Det_registro_produccion detorden = buscarPorId(id);
        st.beginTransaction();
        st.delete(detorden);
        st.getTransaction().commit();
       
    }

    @Override
    public List<Det_registro_produccion> list() {
       return st.createQuery("FROM Det_registro_produccion dt").list();
    }

    @Override
    public Det_registro_produccion buscarPorId(int id) {
        return (Det_registro_produccion) st.load(Det_registro_produccion.class, id);
    }
    
}
