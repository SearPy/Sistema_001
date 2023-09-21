/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import javax.swing.JOptionPane;
import net.Modelos.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */

public class UsuarioDaoImpl implements UsuarioDao{
    private final Session st;

    public UsuarioDaoImpl(Session st) {
        this.st = st;
    }
    
    @Override
    public void guardar(Usuario usuario) {
       st.beginTransaction();
       st.persist(usuario);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Usuario usuario) {
       st.beginTransaction();
       st.persist(usuario);
       st.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        try{
        Usuario usuario = buscarPorId(id);
        st.beginTransaction();
        st.delete(usuario);
        st.getTransaction().commit();
       }catch (Exception e){
           st.getTransaction().rollback();
           JOptionPane.showMessageDialog(null, "Registro en uso , no se puede eliminar");
       }
    }

    @Override
    public List<Usuario> list() {
        return st.createQuery("FROM Usuario tab").list();
    }

    @Override
    public Usuario buscarPorId(int id) {
        return (Usuario) st.load(Usuario.class, id);
    }

    @Override
    public Usuario buscarPorNom(String nombre) {
        Query q = st.createQuery("FROM Usuario a WHERE a.nombre = ?");
        q.setParameter(0, nombre);
        return (Usuario) q.uniqueResult();
    }
    
}
