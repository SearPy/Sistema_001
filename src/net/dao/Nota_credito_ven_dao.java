/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.dao;

import java.util.List;
import net.Modelos.Nota_credito_ven;

/**
 *
 * @author Ramc
 */
public interface Nota_credito_ven_dao {
    void guardar(Nota_credito_ven factura);
    void actualizar(Nota_credito_ven factura);
    List<Nota_credito_ven> list();
    Nota_credito_ven buscarPorId(int id);
}
