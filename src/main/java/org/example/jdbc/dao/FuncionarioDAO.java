package org.example.jdbc.dao;

import org.example.jdbc.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {

    public void inserir(String nome, String cargo, double salario){

        String sql = "INSERT INTO funcionarios (nome, cargo, salario) VALUES (?, ?, ?);";

        try(Connection conn = Conexao.conectar()){

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, nome);
            stmt.setString(2, cargo);
            stmt.setDouble(3, salario);

            stmt.executeUpdate();

            System.out.println("Funcionário cadastrado com sucesso");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizarSalario(double salario, String nome){

        String sql = "UPDATE funcionarios SET salario=? WHERE nome=?;";

        try (Connection conn = Conexao.conectar();){

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setDouble(1, salario);
            stmt.setString(2, nome);

            System.out.println("Salário atualizado com sucesso!");
        }
        catch (SQLException e){

        }
    }

    public void deletarFuncionario(String nome){
        String sql = "DELETE FROM funcionarios WHERE nome=?;";

        try(Connection conn = Conexao.conectar()){

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, nome);
            stmt.executeUpdate();

            System.out.println("Funcionário deletado com sucesso!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
