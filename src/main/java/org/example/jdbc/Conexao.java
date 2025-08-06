package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/jdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "mysqlPW";

    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
