/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Caja;

/**
 *
 * @author RAMC
 */
public interface CajaDao {
    void guardar(Caja cliente);
    void actualizar(Caja cliente);
    void eliminar (int id);
    List<Caja> list();
    Caja buscarPorId(int id);
    Caja buscarPorNom(String nombre);
}
