/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Control_calidad;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Control_calidad_daoimpl implements Control_calidad_dao{
    
    private final Session st;

    public Control_calidad_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Control_calidad ajuste) {
       st.beginTransaction();
       st.persist(ajuste);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Control_calidad ajuste) {
       st.beginTransaction();
       st.persist(ajuste);
       st.getTransaction().commit();
    }

    @Override
    public List<Control_calidad> list() {
       return st.createQuery("FROM Control_calidad pe").list(); 
    }

    @Override
    public Control_calidad buscarPorId(int id) {
        return (Control_calidad) st.load(Control_calidad.class, id);
    }
    
}
