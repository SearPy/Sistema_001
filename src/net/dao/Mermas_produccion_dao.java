/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Mermas_produccion;

/**
 *
 * @author Ramc
 */
public interface Mermas_produccion_dao {
    void guardar(Mermas_produccion ajuste);
    void actualizar(Mermas_produccion ajuste);
    List<Mermas_produccion> list();
    Mermas_produccion buscarPorId(int id);
}
