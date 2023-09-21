/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.presupuesto_prod;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Presupuesto_prod_daoimpl implements Presupuesto_prod_dao{
    
    private final Session st;

    public Presupuesto_prod_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(presupuesto_prod presupuesto) {
       st.beginTransaction();
       st.persist(presupuesto);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(presupuesto_prod presupuesto) {
       st.beginTransaction();
       st.persist(presupuesto);
       st.getTransaction().commit();
    }

    @Override
    public List<presupuesto_prod> list() {
       return st.createQuery("FROM presupuesto_prod pe").list(); 
    }

    @Override
    public presupuesto_prod buscarPorId(int id) {
        return (presupuesto_prod) st.load(presupuesto_prod.class, id);
    }
    
}
