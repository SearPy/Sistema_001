/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_presupuesto_com;

/**
 *
 * @author Ramc
 */
public interface Det_presupuesto_com_dao {
    void guardar(Det_presupuesto_com detpresupuesto);
    void actualizar(Det_presupuesto_com detpresupuesto);
    void eliminar (int id);
    List<Det_presupuesto_com> list();
    Det_presupuesto_com buscarPorId(int id);
}
