/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Nota_credito;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Nota_credito_daoimpl implements Nota_credito_dao{
    
    private final Session st;

    public Nota_credito_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Nota_credito factura) {
       st.beginTransaction();
       st.persist(factura);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Nota_credito factura) {
       st.beginTransaction();
       st.persist(factura);
       st.getTransaction().commit();
    }

    @Override
    public List<Nota_credito> list() {
       return st.createQuery("FROM Nota_credito pe").list(); 
    }

    @Override
    public Nota_credito buscarPorId(int id) {
        return (Nota_credito) st.load(Nota_credito.class, id);
    }
    
}
