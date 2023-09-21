/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Proveedor;

/**
 *
 * @author RAMC
 */
public interface ProveedorDao {
    void guardar(Proveedor proveedor);
    void actualizar(Proveedor proveedor);
    void eliminar (int id);
    List<Proveedor> list();
    Proveedor buscarPorId(int id);
    Proveedor buscarPorNom(String nombre);
}
