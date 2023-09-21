/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import javax.swing.JOptionPane;
import net.Modelos.Libroiva;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */

public class LibroivaDaoImpl implements LibroivaDao{
    private final Session st;

    public LibroivaDaoImpl(Session st) {
        this.st = st;
    }
    
    @Override
    public void guardar(Libroiva libroiva) {
       st.beginTransaction();
       st.persist(libroiva);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Libroiva libroiva) {
       st.beginTransaction();
       st.persist(libroiva);
       st.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        try{
        Libroiva libroiva = buscarPorId(id);
        st.beginTransaction();
        st.delete(libroiva);
        st.getTransaction().commit();
       }catch (Exception e){
           st.getTransaction().rollback();
           JOptionPane.showMessageDialog(null, "Registro en uso , no se puede eliminar");
       }
    }

    @Override
    public List<Libroiva> list() {
        return st.createQuery("FROM Libroiva tab").list();
    }

    @Override
    public Libroiva buscarPorId(int id) {
        return (Libroiva) st.load(Libroiva.class, id);
    }

    @Override
    public Libroiva buscarPorNom(int nombre) {
        Query q = st.createQuery("FROM Libroiva a WHERE a.id_fac = ?");
        q.setParameter(0, nombre);
        return (Libroiva) q.uniqueResult();
    }
    
    @Override
    public Libroiva buscarPorNom2(int nombre) {
        Query q = st.createQuery("FROM Libroiva a WHERE a.id_nc = ?");
        q.setParameter(0, nombre);
        return (Libroiva) q.uniqueResult();
    }
    
}
