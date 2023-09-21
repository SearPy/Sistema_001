/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Control_calidad;

/**
 *
 * @author Ramc
 */
public interface Control_calidad_dao {
    void guardar(Control_calidad ajuste);
    void actualizar(Control_calidad ajuste);
    List<Control_calidad> list();
    Control_calidad buscarPorId(int id);
}
