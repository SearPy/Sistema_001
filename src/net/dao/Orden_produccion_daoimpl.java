/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Orden_produccion;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Orden_produccion_daoimpl implements Orden_produccion_dao{
    
    private final Session st;

    public Orden_produccion_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Orden_produccion orden) {
       st.beginTransaction();
       st.persist(orden);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Orden_produccion orden) {
       st.beginTransaction();
       st.persist(orden);
       st.getTransaction().commit();
    }

    @Override
    public List<Orden_produccion> list() {
       return st.createQuery("FROM Orden_produccion pe").list(); 
    }

    @Override
    public Orden_produccion buscarPorId(int id) {
        return (Orden_produccion) st.load(Orden_produccion.class, id);
    }
    
}
