/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_factura_com;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Det_factura_com_daoimpl implements Det_factura_com_dao{
    private final Session st;

    public Det_factura_com_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Det_factura_com detfactura) {
       st.beginTransaction();
       st.persist(detfactura);
       st.getTransaction().commit();
    }
    
    @Override
    public void actualizar(Det_factura_com detfactura) {
       st.beginTransaction();
       st.persist(detfactura);
       st.getTransaction().commit();
    }
    
    @Override
    public void eliminar(int id) {
    
        Det_factura_com detfactura = buscarPorId(id);
        st.beginTransaction();
        st.delete(detfactura);
        st.getTransaction().commit();
       
    }

    @Override
    public List<Det_factura_com> list() {
       return st.createQuery("FROM Det_factura_com dt").list();
    }

    @Override
    public Det_factura_com buscarPorId(int id) {
        return (Det_factura_com) st.load(Det_factura_com.class, id);
    }
    
}
