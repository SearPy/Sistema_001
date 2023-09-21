/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import javax.swing.JOptionPane;
import net.Modelos.Caja;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */

public class CajaDaoImpl implements CajaDao{
    private final Session st;

    public CajaDaoImpl(Session st) {
        this.st = st;
    }
    
    @Override
    public void guardar(Caja cliente) {
       st.beginTransaction();
       st.persist(cliente);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Caja cliente) {
       st.beginTransaction();
       st.persist(cliente);
       st.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        try{
        Caja cliente = buscarPorId(id);
        st.beginTransaction();
        st.delete(cliente);
        st.getTransaction().commit();
       }catch (Exception e){
           st.getTransaction().rollback();
           JOptionPane.showMessageDialog(null, "Registro en uso , no se puede eliminar");
       }
    }

    @Override
    public List<Caja> list() {
        return st.createQuery("FROM Caja tab").list();
    }

    @Override
    public Caja buscarPorId(int id) {
        return (Caja) st.load(Caja.class, id);
    }

    @Override
    public Caja buscarPorNom(String nombre) {
        Query q = st.createQuery("FROM Caja a WHERE a.ruc = ?");
        q.setParameter(0, nombre);
        return (Caja) q.uniqueResult();
    }
    
}
