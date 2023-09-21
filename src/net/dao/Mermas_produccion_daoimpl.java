/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Mermas_produccion;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Mermas_produccion_daoimpl implements Mermas_produccion_dao{
    
    private final Session st;

    public Mermas_produccion_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Mermas_produccion ajuste) {
       st.beginTransaction();
       st.persist(ajuste);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Mermas_produccion ajuste) {
       st.beginTransaction();
       st.persist(ajuste);
       st.getTransaction().commit();
    }

    @Override
    public List<Mermas_produccion> list() {
       return st.createQuery("FROM Mermas_produccion pe").list(); 
    }

    @Override
    public Mermas_produccion buscarPorId(int id) {
        return (Mermas_produccion) st.load(Mermas_produccion.class, id);
    }
    
}
