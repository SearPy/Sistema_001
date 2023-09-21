/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.datos_login;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */
public class LoginDaoImpl implements LoginDao{
    private final Session st;
    
    public LoginDaoImpl(Session st) {
        this.st = st;
    }

    @Override
    public void guardar(datos_login dl) {
       st.beginTransaction();
       st.persist(dl);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(datos_login dl) {
       st.beginTransaction();
       st.persist(dl);
       st.getTransaction().commit();
    }

    @Override
    public List<datos_login> list() {
         return st.createQuery("FROM datos_login tab").list();
    }

    @Override
    public datos_login buscarPorId(int id) {
        return (datos_login) st.load(datos_login.class, id);
    }
    
}
