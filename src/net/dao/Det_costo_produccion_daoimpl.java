/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_costo_produccion;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Det_costo_produccion_daoimpl implements Det_costo_produccion_dao{
    private final Session st;

    public Det_costo_produccion_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Det_costo_produccion detpresupuesto) {
       st.beginTransaction();
       st.persist(detpresupuesto);
       st.getTransaction().commit();
    }
    
    @Override
    public void actualizar(Det_costo_produccion detpresupuesto) {
       st.beginTransaction();
       st.persist(detpresupuesto);
       st.getTransaction().commit();
    }
    
    @Override
    public void eliminar(int id) {
    
        Det_costo_produccion detpresupuesto = buscarPorId(id);
        st.beginTransaction();
        st.delete(detpresupuesto);
        st.getTransaction().commit();
       
    }

    @Override
    public List<Det_costo_produccion> list() {
       return st.createQuery("FROM Det_costo_produccion dt").list();
    }

    @Override
    public Det_costo_produccion buscarPorId(int id) {
        return (Det_costo_produccion) st.load(Det_costo_produccion.class, id);
    }
    
}
