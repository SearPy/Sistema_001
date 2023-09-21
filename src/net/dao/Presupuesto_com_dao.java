/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Presupuesto_com;

/**
 *
 * @author Ramc
 */
public interface Presupuesto_com_dao {
    void guardar(Presupuesto_com presupuesto);
    void actualizar(Presupuesto_com presupuesto);
    List<Presupuesto_com> list();
    Presupuesto_com buscarPorId(int id);
}
