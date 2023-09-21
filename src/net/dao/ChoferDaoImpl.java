/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import javax.swing.JOptionPane;
import net.Modelos.Chofer;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */

public class ChoferDaoImpl implements ChoferDao{
    private final Session st;

    public ChoferDaoImpl(Session st) {
        this.st = st;
    }
    
    @Override
    public void guardar(Chofer chofer) {
       st.beginTransaction();
       st.persist(chofer);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Chofer chofer) {
       st.beginTransaction();
       st.persist(chofer);
       st.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        try{
        Chofer chofer = buscarPorId(id);
        st.beginTransaction();
        st.delete(chofer);
        st.getTransaction().commit();
       }catch (Exception e){
           st.getTransaction().rollback();
           JOptionPane.showMessageDialog(null, "Registro en uso , no se puede eliminar");
       }
    }

    @Override
    public List<Chofer> list() {
        return st.createQuery("FROM Chofer tab").list();
    }

    @Override
    public Chofer buscarPorId(int id) {
        return (Chofer) st.load(Chofer.class, id);
    }

    @Override
    public Chofer buscarPorNom(String nombre) {
        Query q = st.createQuery("FROM Chofer a WHERE a.ruc = ?");
        q.setParameter(0, nombre);
        return (Chofer) q.uniqueResult();
    }
    
}
