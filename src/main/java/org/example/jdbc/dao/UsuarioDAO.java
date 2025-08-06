package org.example.jdbc.dao;

import org.example.jdbc.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void inserir(String usuario, String senha, String email){
        String sql = "INSERT INTO usuario (usuario, senha, email) VALUES (?, ?, ?)";

        try(Connection conn = Conexao.conectar()){
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            stmt.setString(3, email);
            stmt.executeUpdate();

            System.out.println("Usuário cadastrado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void listar(){
        String sql = "SELECT * FROM usuario;";


    }

    public void atualizar(int id){

    }

    public void deletar(int id){

    }
}
