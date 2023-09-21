/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Registro_produccion;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Registro_produccion_daoimpl implements Registro_produccion_dao{
    
    private final Session st;

    public Registro_produccion_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Registro_produccion orden) {
       st.beginTransaction();
       st.persist(orden);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Registro_produccion orden) {
       st.beginTransaction();
       st.persist(orden);
       st.getTransaction().commit();
    }

    @Override
    public List<Registro_produccion> list() {
       return st.createQuery("FROM Registro_produccion pe").list(); 
    }

    @Override
    public Registro_produccion buscarPorId(int id) {
        return (Registro_produccion) st.load(Registro_produccion.class, id);
    }
    
}
