package org.example.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String args[]){
        try(Connection conn = Conexao.conectar()){
            if(conn != null){
                System.out.println("Conectado com sucesso!");
            }
            else{
                System.out.println("Falha na conexão");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }
}
