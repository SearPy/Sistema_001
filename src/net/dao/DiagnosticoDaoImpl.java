/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import javax.swing.JOptionPane;
import net.Modelos.Diagnostico;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RAMC
 */

public class DiagnosticoDaoImpl implements DiagnosticoDao{
    private final Session st;

    public DiagnosticoDaoImpl(Session st) {
        this.st = st;
    }
    
    @Override
    public void guardar(Diagnostico cliente) {
       st.beginTransaction();
       st.persist(cliente);
       st.getTransaction().commit();
    }

    @Override
    public void actualizar(Diagnostico cliente) {
       st.beginTransaction();
       st.persist(cliente);
       st.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        try{
        Diagnostico cliente = buscarPorId(id);
        st.beginTransaction();
        st.delete(cliente);
        st.getTransaction().commit();
       }catch (Exception e){
           st.getTransaction().rollback();
           JOptionPane.showMessageDialog(null, "Registro en uso , no se puede eliminar");
       }
    }

    @Override
    public List<Diagnostico> list() {
        return st.createQuery("FROM Diagnostico tab").list();
    }

    @Override
    public Diagnostico buscarPorId(int id) {
        return (Diagnostico) st.load(Diagnostico.class, id);
    }

    
}
