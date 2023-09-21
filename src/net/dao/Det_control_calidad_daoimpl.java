/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_control_calidad;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Det_control_calidad_daoimpl implements Det_control_calidad_dao{
    private final Session st;

    public Det_control_calidad_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Det_control_calidad detajuste) {
       st.beginTransaction();
       st.persist(detajuste);
       st.getTransaction().commit();
    }
    
    @Override
    public void actualizar(Det_control_calidad detajuste) {
       st.beginTransaction();
       st.persist(detajuste);
       st.getTransaction().commit();
    }
    
    @Override
    public void eliminar(int id) {
    
        Det_control_calidad detajuste = buscarPorId(id);
        st.beginTransaction();
        st.delete(detajuste);
        st.getTransaction().commit();
       
    }

    @Override
    public List<Det_control_calidad> list() {
       return st.createQuery("FROM Det_control_calidad dt").list();
    }

    @Override
    public Det_control_calidad buscarPorId(int id) {
        return (Det_control_calidad) st.load(Det_control_calidad.class, id);
    }
    
}
