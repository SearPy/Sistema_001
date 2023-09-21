/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Libroivaven;

/**
 *
 * @author RAMC
 */
public interface LibroivavenDao {
    void guardar(Libroivaven libroiva);
    void actualizar(Libroivaven libroiva);
    void eliminar (int id);
    List<Libroivaven> list();
    Libroivaven buscarPorId(int id);
    Libroivaven buscarPorNom(int nombre);
    Libroivaven buscarPorNom2(int nombre);
}
