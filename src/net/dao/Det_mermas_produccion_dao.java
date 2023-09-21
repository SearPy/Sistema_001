/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_mermas_produccion;

/**
 *
 * @author Ramc
 */
public interface Det_mermas_produccion_dao {
    void guardar(Det_mermas_produccion detajuste);
    void actualizar(Det_mermas_produccion detajuste);
    void eliminar (int id);
    List<Det_mermas_produccion> list();
    Det_mermas_produccion buscarPorId(int id);
}
