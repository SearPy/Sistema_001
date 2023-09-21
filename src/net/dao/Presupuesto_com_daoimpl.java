/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Presupuesto_com;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Presupuesto_com_daoimpl implements Presupuesto_com_dao{
    
    private final Session st;

    public Presupuesto_com_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Presupuesto_com presupuesto) {
       st.beginTransaction();
       st.persist(presupuesto);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Presupuesto_com presupuesto) {
       st.beginTransaction();
       st.persist(presupuesto);
       st.getTransaction().commit();
    }

    @Override
    public List<Presupuesto_com> list() {
       return st.createQuery("FROM Presupuesto_com pe").list(); 
    }

    @Override
    public Presupuesto_com buscarPorId(int id) {
        return (Presupuesto_com) st.load(Presupuesto_com.class, id);
    }
    
}
