/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Cliente;

/**
 *
 * @author RAMC
 */
public interface ClienteDao {
    void guardar(Cliente cliente);
    void actualizar(Cliente cliente);
    void eliminar (int id);
    List<Cliente> list();
    Cliente buscarPorId(int id);
    Cliente buscarPorNom(String nombre);
}
