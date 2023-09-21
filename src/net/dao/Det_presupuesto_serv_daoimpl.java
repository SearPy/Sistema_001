/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_presupuesto_serv;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Det_presupuesto_serv_daoimpl implements Det_presupuesto_serv_dao{
    private final Session st;

    public Det_presupuesto_serv_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Det_presupuesto_serv detpresupuesto) {
       st.beginTransaction();
       st.persist(detpresupuesto);
       st.getTransaction().commit();
    }
    
    @Override
    public void actualizar(Det_presupuesto_serv detpresupuesto) {
       st.beginTransaction();
       st.persist(detpresupuesto);
       st.getTransaction().commit();
    }
    
    @Override
    public void eliminar(int id) {
    
        Det_presupuesto_serv detpresupuesto = buscarPorId(id);
        st.beginTransaction();
        st.delete(detpresupuesto);
        st.getTransaction().commit();
       
    }

    @Override
    public List<Det_presupuesto_serv> list() {
       return st.createQuery("FROM Det_presupuesto_serv dt").list();
    }

    @Override
    public Det_presupuesto_serv buscarPorId(int id) {
        return (Det_presupuesto_serv) st.load(Det_presupuesto_serv.class, id);
    }
    
}
