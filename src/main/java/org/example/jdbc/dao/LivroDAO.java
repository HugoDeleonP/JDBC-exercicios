package org.example.jdbc.dao;

import org.example.jdbc.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroDAO {

    public void inserir(String titulo, String autor, int ano_publicacao){

        String sql = "INSERT INTO livros (titulo, autor, ano_publicacao) VALUES (?, ?, ?);";

        try(Connection conn = Conexao.conectar()){

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, titulo);
            stmt.setString(2, autor);
            stmt.setInt(3, ano_publicacao);

            stmt.executeUpdate();

            System.out.println("Livro cadastrado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void atualizarAutor(String autor, String titulo){

        String sql = "UPDATE livros SET autor = ? WHERE titulo = ?;";

        try(Connection conn = Conexao.conectar()){

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, autor);
            stmt.setString(2, titulo);

            stmt.executeUpdate();

            System.out.println("Autor de livro atualizado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deletarLivro(String titulo){

        String sql = "DELETE FROM livros WHERE titulo = ?;";

        try(Connection conn = Conexao.conectar()){

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, titulo);
            stmt.executeUpdate();

            System.out.println("Livro deletado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
