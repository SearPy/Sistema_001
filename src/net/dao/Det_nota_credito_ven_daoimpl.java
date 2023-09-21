/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_nota_credito_ven;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Det_nota_credito_ven_daoimpl implements Det_nota_credito_ven_dao{
    private final Session st;

    public Det_nota_credito_ven_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Det_nota_credito_ven detfactura) {
       st.beginTransaction();
       st.persist(detfactura);
       st.getTransaction().commit();
    }
    
    @Override
    public void actualizar(Det_nota_credito_ven detfactura) {
       st.beginTransaction();
       st.persist(detfactura);
       st.getTransaction().commit();
    }
    
    @Override
    public void eliminar(int id) {
    
        Det_nota_credito_ven detfactura = buscarPorId(id);
        st.beginTransaction();
        st.delete(detfactura);
        st.getTransaction().commit();
       
    }

    @Override
    public List<Det_nota_credito_ven> list() {
       return st.createQuery("FROM Det_nota_credito_ven dt").list();
    }

    @Override
    public Det_nota_credito_ven buscarPorId(int id) {
        return (Det_nota_credito_ven) st.load(Det_nota_credito_ven.class, id);
    }
    
}
