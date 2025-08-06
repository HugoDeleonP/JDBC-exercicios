package org.example.jdbc.dao;

import org.example.jdbc.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidoDAO {

    public void inserir(String cliente, String data_pedido, double total){
        String sql = "INSERT INTO pedidos (cliente, data_pedido, total) VALUES (?, ?, ?);";

        try(Connection conn = Conexao.conectar()){
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente);
            stmt.setString(2, data_pedido);
            stmt.setDouble(3, total);

            stmt.executeUpdate();

            System.out.println("Pedido cadastrado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
