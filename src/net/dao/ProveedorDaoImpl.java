/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import javax.swing.JOptionPane;
import net.Modelos.Proveedor;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */

public class ProveedorDaoImpl implements ProveedorDao{
    private final Session st;

    public ProveedorDaoImpl(Session st) {
        this.st = st;
    }
    
    @Override
    public void guardar(Proveedor proveedor) {
       st.beginTransaction();
       st.persist(proveedor);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Proveedor proveedor) {
       st.beginTransaction();
       st.persist(proveedor);
       st.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        try{
        Proveedor proveedor = buscarPorId(id);
        st.beginTransaction();
        st.delete(proveedor);
        st.getTransaction().commit();
       }catch (Exception e){
           st.getTransaction().rollback();
           JOptionPane.showMessageDialog(null, "Registro en uso , no se puede eliminar");
       }
    }

    @Override
    public List<Proveedor> list() {
        return st.createQuery("FROM Proveedor tab").list();
    }

    @Override
    public Proveedor buscarPorId(int id) {
        return (Proveedor) st.load(Proveedor.class, id);
    }

    @Override
    public Proveedor buscarPorNom(String nombre) {
        Query q = st.createQuery("FROM Proveedor a WHERE a.ruc = ?");
        q.setParameter(0, nombre);
        return (Proveedor) q.uniqueResult();
    }
    
}
