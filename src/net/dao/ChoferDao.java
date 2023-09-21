/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Chofer;

/**
 *
 * @author RAMC
 */
public interface ChoferDao {
    void guardar(Chofer chofer);
    void actualizar(Chofer chofer);
    void eliminar (int id);
    List<Chofer> list();
    Chofer buscarPorId(int id);
    Chofer buscarPorNom(String nombre);
}
