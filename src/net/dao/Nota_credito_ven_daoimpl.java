/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Nota_credito_ven;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Nota_credito_ven_daoimpl implements Nota_credito_ven_dao{
    
    private final Session st;

    public Nota_credito_ven_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Nota_credito_ven factura) {
       st.beginTransaction();
       st.persist(factura);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Nota_credito_ven factura) {
       st.beginTransaction();
       st.persist(factura);
       st.getTransaction().commit();
    }

    @Override
    public List<Nota_credito_ven> list() {
       return st.createQuery("FROM Nota_credito_ven pe").list(); 
    }

    @Override
    public Nota_credito_ven buscarPorId(int id) {
        return (Nota_credito_ven) st.load(Nota_credito_ven.class, id);
    }
    
}
