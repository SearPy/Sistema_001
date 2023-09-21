/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Presupuesto_serv;

/**
 *
 * @author Ramc
 */
public interface Presupuesto_serv_dao {
    void guardar(Presupuesto_serv presupuesto);
    void actualizar(Presupuesto_serv presupuesto);
    List<Presupuesto_serv> list();
    Presupuesto_serv buscarPorId(int id);
}
