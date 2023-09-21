/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Presupuesto_serv;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Presupuesto_serv_daoimpl implements Presupuesto_serv_dao{
    
    private final Session st;

    public Presupuesto_serv_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Presupuesto_serv presupuesto) {
       st.beginTransaction();
       st.persist(presupuesto);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Presupuesto_serv presupuesto) {
       st.beginTransaction();
       st.persist(presupuesto);
       st.getTransaction().commit();
    }

    @Override
    public List<Presupuesto_serv> list() {
       return st.createQuery("FROM Presupuesto_serv pe").list(); 
    }

    @Override
    public Presupuesto_serv buscarPorId(int id) {
        return (Presupuesto_serv) st.load(Presupuesto_serv.class, id);
    }
    
}
