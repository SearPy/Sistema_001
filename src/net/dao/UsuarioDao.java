/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Usuario;

/**
 *
 * @author RAMC
 */
public interface UsuarioDao {
     void guardar(Usuario usuario);
    void actualizar(Usuario usuario);
    void eliminar (int id);
    List<Usuario> list();
    Usuario buscarPorId(int id);
    Usuario buscarPorNom(String nombre);
}
