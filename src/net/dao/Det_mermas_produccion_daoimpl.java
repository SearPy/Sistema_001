/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_mermas_produccion;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Det_mermas_produccion_daoimpl implements Det_mermas_produccion_dao{
    private final Session st;

    public Det_mermas_produccion_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Det_mermas_produccion detajuste) {
       st.beginTransaction();
       st.persist(detajuste);
       st.getTransaction().commit();
    }
    
    @Override
    public void actualizar(Det_mermas_produccion detajuste) {
       st.beginTransaction();
       st.persist(detajuste);
       st.getTransaction().commit();
    }
    
    @Override
    public void eliminar(int id) {
    
        Det_mermas_produccion detajuste = buscarPorId(id);
        st.beginTransaction();
        st.delete(detajuste);
        st.getTransaction().commit();
       
    }

    @Override
    public List<Det_mermas_produccion> list() {
       return st.createQuery("FROM Det_mermas_produccion dt").list();
    }

    @Override
    public Det_mermas_produccion buscarPorId(int id) {
        return (Det_mermas_produccion) st.load(Det_mermas_produccion.class, id);
    }
    
}
