/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_nota_credito;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Det_nota_credito_daoimpl implements Det_nota_credito_dao{
    private final Session st;

    public Det_nota_credito_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Det_nota_credito detfactura) {
       st.beginTransaction();
       st.persist(detfactura);
       st.getTransaction().commit();
    }
    
    @Override
    public void actualizar(Det_nota_credito detfactura) {
       st.beginTransaction();
       st.persist(detfactura);
       st.getTransaction().commit();
    }
    
    @Override
    public void eliminar(int id) {
    
        Det_nota_credito detfactura = buscarPorId(id);
        st.beginTransaction();
        st.delete(detfactura);
        st.getTransaction().commit();
       
    }

    @Override
    public List<Det_nota_credito> list() {
       return st.createQuery("FROM Det_nota_credito dt").list();
    }

    @Override
    public Det_nota_credito buscarPorId(int id) {
        return (Det_nota_credito) st.load(Det_nota_credito.class, id);
    }
    
}
