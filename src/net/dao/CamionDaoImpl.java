/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import javax.swing.JOptionPane;
import net.Modelos.Camion;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */

public class CamionDaoImpl implements CamionDao{
    private final Session st;

    public CamionDaoImpl(Session st) {
        this.st = st;
    }
    
    @Override
    public void guardar(Camion camion) {
       st.beginTransaction();
       st.persist(camion);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Camion camion) {
       st.beginTransaction();
       st.persist(camion);
       st.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        try{
        Camion camion = buscarPorId(id);
        st.beginTransaction();
        st.delete(camion);
        st.getTransaction().commit();
       }catch (Exception e){
           st.getTransaction().rollback();
           JOptionPane.showMessageDialog(null, "Registro en uso , no se puede eliminar");
       }
    }

    @Override
    public List<Camion> list() {
        return st.createQuery("FROM Camion tab").list();
    }

    @Override
    public Camion buscarPorId(int id) {
        return (Camion) st.load(Camion.class, id);
    }

    @Override
    public Camion buscarPorNom(String nombre) {
        Query q = st.createQuery("FROM Camion a WHERE a.ruc = ?");
        q.setParameter(0, nombre);
        return (Camion) q.uniqueResult();
    }
    
}
