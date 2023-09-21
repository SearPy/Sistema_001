/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import javax.swing.JOptionPane;
import net.Modelos.Cliente;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */

public class ClienteDaoImpl implements ClienteDao{
    private final Session st;

    public ClienteDaoImpl(Session st) {
        this.st = st;
    }
    
    @Override
    public void guardar(Cliente cliente) {
       st.beginTransaction();
       st.persist(cliente);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Cliente cliente) {
       st.beginTransaction();
       st.persist(cliente);
       st.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        try{
        Cliente cliente = buscarPorId(id);
        st.beginTransaction();
        st.delete(cliente);
        st.getTransaction().commit();
       }catch (Exception e){
           st.getTransaction().rollback();
           JOptionPane.showMessageDialog(null, "Registro en uso , no se puede eliminar");
       }
    }

    @Override
    public List<Cliente> list() {
        return st.createQuery("FROM Cliente tab").list();
    }

    @Override
    public Cliente buscarPorId(int id) {
        return (Cliente) st.load(Cliente.class, id);
    }

    @Override
    public Cliente buscarPorNom(String nombre) {
        Query q = st.createQuery("FROM Cliente a WHERE a.ruc = ?");
        q.setParameter(0, nombre);
        return (Cliente) q.uniqueResult();
    }
    
}
