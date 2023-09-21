/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Factura_com;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Factura_com_daoimpl implements Factura_com_dao{
    
    private final Session st;

    public Factura_com_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Factura_com factura) {
       st.beginTransaction();
       st.persist(factura);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Factura_com factura) {
       st.beginTransaction();
       st.persist(factura);
       st.getTransaction().commit();
    }

    @Override
    public List<Factura_com> list() {
       return st.createQuery("FROM Factura_com pe").list(); 
    }

    @Override
    public Factura_com buscarPorId(int id) {
        return (Factura_com) st.load(Factura_com.class, id);
    }
    
}
