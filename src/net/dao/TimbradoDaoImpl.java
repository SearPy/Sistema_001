/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import javax.swing.JOptionPane;
import net.Modelos.Timbrado;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */

public class TimbradoDaoImpl implements TimbradoDao{
    private final Session st;

    public TimbradoDaoImpl(Session st) {
        this.st = st;
    }
    
    @Override
    public void guardar(Timbrado cliente) {
       st.beginTransaction();
       st.persist(cliente);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Timbrado cliente) {
       st.beginTransaction();
       st.persist(cliente);
       st.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        try{
        Timbrado cliente = buscarPorId(id);
        st.beginTransaction();
        st.delete(cliente);
        st.getTransaction().commit();
       }catch (Exception e){
           st.getTransaction().rollback();
           JOptionPane.showMessageDialog(null, "Registro en uso , no se puede eliminar");
       }
    }

    @Override
    public List<Timbrado> list() {
        return st.createQuery("FROM Timbrado tab").list();
    }

    @Override
    public Timbrado buscarPorId(int id) {
        return (Timbrado) st.load(Timbrado.class, id);
    }

    @Override
    public Timbrado buscarPorNom(String nombre) {
        Query q = st.createQuery("FROM Timbrado a WHERE a.ruc = ?");
        q.setParameter(0, nombre);
        return (Timbrado) q.uniqueResult();
    }
    
}
