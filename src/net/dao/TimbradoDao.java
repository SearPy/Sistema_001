/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Timbrado;

/**
 *
 * @author RAMC
 */
public interface TimbradoDao {
    void guardar(Timbrado cliente);
    void actualizar(Timbrado cliente);
    void eliminar (int id);
    List<Timbrado> list();
    Timbrado buscarPorId(int id);
    Timbrado buscarPorNom(String nombre);
}
