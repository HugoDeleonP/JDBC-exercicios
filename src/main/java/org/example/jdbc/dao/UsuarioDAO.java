package org.example.jdbc.dao;

import org.example.jdbc.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void inserir(String usuario, String email){
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?);";

        try(Connection conn = Conexao.conectar()){
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, usuario);
            stmt.setString(2, email);
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

    public void atualizarEmail(String nome, String novoEmail){
        String sql = "UPDATE usuarios SET email = ? WHERE nome = ?;";

        try(Connection conn = Conexao.conectar()){
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, novoEmail);
            stmt.setString(2, nome);
            stmt.executeUpdate();

            System.out.println("Email atualizado com sucesso!");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deletar(int id){

    }
}
