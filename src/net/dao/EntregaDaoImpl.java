/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import javax.swing.JOptionPane;
import net.Modelos.Entrega;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */

public class EntregaDaoImpl implements EntregaDao{
    private final Session st;

    public EntregaDaoImpl(Session st) {
        this.st = st;
    }
    
    @Override
    public void guardar(Entrega cliente) {
       st.beginTransaction();
       st.persist(cliente);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Entrega cliente) {
       st.beginTransaction();
       st.persist(cliente);
       st.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        try{
        Entrega cliente = buscarPorId(id);
        st.beginTransaction();
        st.delete(cliente);
        st.getTransaction().commit();
       }catch (Exception e){
           st.getTransaction().rollback();
           JOptionPane.showMessageDialog(null, "Registro en uso , no se puede eliminar");
       }
    }

    @Override
    public List<Entrega> list() {
        return st.createQuery("FROM Entrega tab").list();
    }

    @Override
    public Entrega buscarPorId(int id) {
        return (Entrega) st.load(Entrega.class, id);
    }

    @Override
    public Entrega buscarPorNom(String nombre) {
        Query q = st.createQuery("FROM Entrega a WHERE a.ruc = ?");
        q.setParameter(0, nombre);
        return (Entrega) q.uniqueResult();
    }
    
}
