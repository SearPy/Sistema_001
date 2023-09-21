/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import javax.swing.JOptionPane;
import net.Modelos.Recepcion;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */

public class RecepcionDaoImpl implements RecepcionDao{
    private final Session st;

    public RecepcionDaoImpl(Session st) {
        this.st = st;
    }
    
    @Override
    public void guardar(Recepcion cliente) {
       st.beginTransaction();
       st.persist(cliente);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Recepcion cliente) {
       st.beginTransaction();
       st.persist(cliente);
       st.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        try{
        Recepcion cliente = buscarPorId(id);
        st.beginTransaction();
        st.delete(cliente);
        st.getTransaction().commit();
       }catch (Exception e){
           st.getTransaction().rollback();
           JOptionPane.showMessageDialog(null, "Registro en uso , no se puede eliminar");
       }
    }

    @Override
    public List<Recepcion> list() {
        return st.createQuery("FROM Recepcion tab").list();
    }

    @Override
    public Recepcion buscarPorId(int id) {
        return (Recepcion) st.load(Recepcion.class, id);
    }

    
}
