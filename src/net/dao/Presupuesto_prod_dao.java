/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.presupuesto_prod;

/**
 *
 * @author Ramc
 */
public interface Presupuesto_prod_dao {
    void guardar(presupuesto_prod presupuesto);
    void actualizar(presupuesto_prod presupuesto);
    List<presupuesto_prod> list();
    presupuesto_prod buscarPorId(int id);
}
