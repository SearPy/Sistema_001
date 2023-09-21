/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import javax.swing.JOptionPane;
import net.Modelos.Libroivaven;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */

public class LibroivavenDaoImpl implements LibroivavenDao{
    private final Session st;

    public LibroivavenDaoImpl(Session st) {
        this.st = st;
    }
    
    @Override
    public void guardar(Libroivaven libroiva) {
       st.beginTransaction();
       st.persist(libroiva);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Libroivaven libroiva) {
       st.beginTransaction();
       st.persist(libroiva);
       st.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        try{
        Libroivaven libroiva = buscarPorId(id);
        st.beginTransaction();
        st.delete(libroiva);
        st.getTransaction().commit();
       }catch (Exception e){
           st.getTransaction().rollback();
           JOptionPane.showMessageDialog(null, "Registro en uso , no se puede eliminar");
       }
    }

    @Override
    public List<Libroivaven> list() {
        return st.createQuery("FROM Libroivaven tab").list();
    }

    @Override
    public Libroivaven buscarPorId(int id) {
        return (Libroivaven) st.load(Libroivaven.class, id);
    }

    @Override
    public Libroivaven buscarPorNom(int nombre) {
        Query q = st.createQuery("FROM Libroivaven a WHERE a.id_fac = ?");
        q.setParameter(0, nombre);
        return (Libroivaven) q.uniqueResult();
    }
    
    @Override
    public Libroivaven buscarPorNom2(int nombre) {
        Query q = st.createQuery("FROM Libroivaven a WHERE a.id_nc = ?");
        q.setParameter(0, nombre);
        return (Libroivaven) q.uniqueResult();
    }
    
}
