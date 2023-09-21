/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Inventario;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Inventario_daoimpl implements Inventario_dao{
    
    private final Session st;

    public Inventario_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Inventario inventario) {
       st.beginTransaction();
       st.persist(inventario);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Inventario inventario) {
       st.beginTransaction();
       st.persist(inventario);
       st.getTransaction().commit();
    }

    @Override
    public List<Inventario> list() {
       return st.createQuery("FROM Inventario pe").list(); 
    }

    @Override
    public Inventario buscarPorId(int id) {
        return (Inventario) st.load(Inventario.class, id);
    }
    
}
