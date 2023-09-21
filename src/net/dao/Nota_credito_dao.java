/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Nota_credito;

/**
 *
 * @author Ramc
 */
public interface Nota_credito_dao {
    void guardar(Nota_credito factura);
    void actualizar(Nota_credito factura);
    List<Nota_credito> list();
    Nota_credito buscarPorId(int id);
}
