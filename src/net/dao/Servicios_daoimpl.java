/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Servicios;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Servicios_daoimpl implements Servicios_dao{
    
    private final Session st;

    public Servicios_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Servicios orden) {
       st.beginTransaction();
       st.persist(orden);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Servicios orden) {
       st.beginTransaction();
       st.persist(orden);
       st.getTransaction().commit();
    }

    @Override
    public List<Servicios> list() {
       return st.createQuery("FROM Servicios pe").list(); 
    }

    @Override
    public Servicios buscarPorId(int id) {
        return (Servicios) st.load(Servicios.class, id);
    }
    
}
