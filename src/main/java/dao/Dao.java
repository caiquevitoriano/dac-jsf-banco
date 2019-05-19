/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author caique
 */
public interface Dao<T> {
    
    void cadastrar (T object) throws SQLException;
    void excluir (T object) throws SQLException;
    void atualizar (T object) throws SQLException;
    List<T> listar () throws SQLException;
    
}
