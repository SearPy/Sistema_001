/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Orden_serv;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Orden_serv_daoimpl implements Orden_serv_dao{
    
    private final Session st;

    public Orden_serv_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Orden_serv orden) {
       st.beginTransaction();
       st.persist(orden);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Orden_serv orden) {
       st.beginTransaction();
       st.persist(orden);
       st.getTransaction().commit();
    }

    @Override
    public List<Orden_serv> list() {
       return st.createQuery("FROM Orden_serv pe").list(); 
    }

    @Override
    public Orden_serv buscarPorId(int id) {
        return (Orden_serv) st.load(Orden_serv.class, id);
    }
    
}
