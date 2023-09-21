/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Factura_ven;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Factura_ven_daoimpl implements Factura_ven_dao{
    
    private final Session st;

    public Factura_ven_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Factura_ven factura) {
       st.beginTransaction();
       st.persist(factura);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Factura_ven factura) {
       st.beginTransaction();
       st.persist(factura);
       st.getTransaction().commit();
    }

    @Override
    public List<Factura_ven> list() {
       return st.createQuery("FROM Factura_ven pe").list(); 
    }

    @Override
    public Factura_ven buscarPorId(int id) {
        return (Factura_ven) st.load(Factura_ven.class, id);
    }
    
}
