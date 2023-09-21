/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import javax.swing.JOptionPane;
import net.Modelos.Cobros;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */

public class CobrosDaoImpl implements CobrosDao{
    private final Session st;

    public CobrosDaoImpl(Session st) {
        this.st = st;
    }
    
    @Override
    public void guardar(Cobros cliente) {
       st.beginTransaction();
       st.persist(cliente);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Cobros cliente) {
       st.beginTransaction();
       st.persist(cliente);
       st.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        try{
        Cobros cliente = buscarPorId(id);
        st.beginTransaction();
        st.delete(cliente);
        st.getTransaction().commit();
       }catch (Exception e){
           st.getTransaction().rollback();
           JOptionPane.showMessageDialog(null, "Registro en uso , no se puede eliminar");
       }
    }

    @Override
    public List<Cobros> list() {
        return st.createQuery("FROM Cobros tab").list();
    }

    @Override
    public Cobros buscarPorId(int id) {
        return (Cobros) st.load(Cobros.class, id);
    }

    @Override
    public Cobros buscarPorNom(String nombre) {
        Query q = st.createQuery("FROM Cobros a WHERE a.ruc = ?");
        q.setParameter(0, nombre);
        return (Cobros) q.uniqueResult();
    }
    
}
