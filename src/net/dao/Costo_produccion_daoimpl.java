/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Costo_produccion;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Costo_produccion_daoimpl implements Costo_produccion_dao{
    
    private final Session st;

    public Costo_produccion_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Costo_produccion presupuesto) {
       st.beginTransaction();
       st.persist(presupuesto);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Costo_produccion presupuesto) {
       st.beginTransaction();
       st.persist(presupuesto);
       st.getTransaction().commit();
    }

    @Override
    public List<Costo_produccion> list() {
       return st.createQuery("FROM Costo_produccion pe").list(); 
    }

    @Override
    public Costo_produccion buscarPorId(int id) {
        return (Costo_produccion) st.load(Costo_produccion.class, id);
    }
    
}
