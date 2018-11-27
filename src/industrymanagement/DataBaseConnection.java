/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package industrymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nsousa
 */
public class DataBaseConnection {
    
    public static Connection createConnection() throws SQLException{
        String url = "jdbc:sqlite:E:/Arquivos/GerenciamentoIndustria/industryDB.db"; //Nome da base de dados
         
        Connection connection = null;
        connection = DriverManager.getConnection(url);
         
        return connection;
    }
    
}
