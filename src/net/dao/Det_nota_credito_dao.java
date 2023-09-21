/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Det_nota_credito;

/**
 *
 * @author Ramc
 */
public interface Det_nota_credito_dao {
    void guardar(Det_nota_credito detfactura);
    void actualizar(Det_nota_credito detfactura);
    void eliminar (int id);
    List<Det_nota_credito> list();
    Det_nota_credito buscarPorId(int id);
}
