/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import javax.swing.JOptionPane;
import net. Modelos.Producto;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */

public class Producto_daoimpl implements Producto_dao{
    private final Session st;

    public Producto_daoimpl(Session st) {
        this.st = st;
    }
    
    @Override
    public void guardar(Producto producto) {
       st.beginTransaction();
       st.persist(producto);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Producto producto) {
       st.beginTransaction();
       st.persist(producto);
       st.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        try{
        Producto producto = buscarPorId(id);
        st.beginTransaction();
        st.delete(producto);
        st.getTransaction().commit();
       }catch (Exception e){
           st.getTransaction().rollback();
           JOptionPane.showMessageDialog(null, "Registro en uso , no se puede eliminar");
       }
    }

    @Override
    public List<Producto> list() {
        return st.createQuery("FROM Producto tab").list();
    }

    @Override
    public Producto buscarPorId(int id) {
        return (Producto) st.load(Producto.class, id);
    }
    
}
