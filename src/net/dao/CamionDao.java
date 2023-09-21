/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Camion;

/**
 *
 * @author RAMC
 */
public interface CamionDao {
    void guardar(Camion camion);
    void actualizar(Camion camion);
    void eliminar (int id);
    List<Camion> list();
    Camion buscarPorId(int id);
    Camion buscarPorNom(String nombre);
}
