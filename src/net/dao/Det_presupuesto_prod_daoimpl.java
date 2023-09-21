/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_presupuesto_prod;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Det_presupuesto_prod_daoimpl implements Det_presupuesto_prod_dao{
    private final Session st;

    public Det_presupuesto_prod_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Det_presupuesto_prod detpresupuesto) {
       st.beginTransaction();
       st.persist(detpresupuesto);
       st.getTransaction().commit();
    }
    
    @Override
    public void actualizar(Det_presupuesto_prod detpresupuesto) {
       st.beginTransaction();
       st.persist(detpresupuesto);
       st.getTransaction().commit();
    }
    
    @Override
    public void eliminar(int id) {
    
        Det_presupuesto_prod detpresupuesto = buscarPorId(id);
        st.beginTransaction();
        st.delete(detpresupuesto);
        st.getTransaction().commit();
       
    }

    @Override
    public List<Det_presupuesto_prod> list() {
       return st.createQuery("FROM Det_presupuesto_prod dt").list();
    }

    @Override
    public Det_presupuesto_prod buscarPorId(int id) {
        return (Det_presupuesto_prod) st.load(Det_presupuesto_prod.class, id);
    }
    
}
