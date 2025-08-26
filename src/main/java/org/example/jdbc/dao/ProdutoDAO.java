package org.example.jdbc.dao;
import org.example.jdbc.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProdutoDAO {

    public void inserir(String nome, double preco, int quantidade){

        String sql = "INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?);";

        try(Connection conn = Conexao.conectar()){
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, nome);
            stmt.setDouble(2, preco);
            stmt.setInt(3, quantidade);

            stmt.executeUpdate();

            System.out.println("Produto cadastrado com sucesso!");

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizarPreco(double preco, String nome){

        String sql = "UPDATE produtos SET preco = ? WHERE nome = ?;";

        try(Connection conn = Conexao.conectar()){
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setDouble(1, preco);
            stmt.setString(2, nome);

            System.out.println("Preço atualizado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
