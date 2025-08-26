package org.example.service;

import org.example.UserInterface;
import org.example.jdbc.dao.*;

public class ManagerDB {

    UserInterface ui;

    public ManagerDB() {
        ui = new UserInterface();
    }

    public void tabela(int tabela) {

        int operacao = -1;

        switch (tabela) {

            case 1 -> {
                UsuarioDAO dataUsuario = new UsuarioDAO();

                operacao = ui.mainMenu("Usuários");


                switch (operacao){

                    case 1 -> {
                        String usuario = ui.setNome("usuário");
                        String email = ui.setEmail();

                        dataUsuario.inserir(usuario, email);
                    }

                    case 2 -> {

                    }

                    case 3 -> {
                        String nome = ui.setNome("usuário");
                        String email = ui.setEmail();

                        //atualiza email através do nome do usuário

                        dataUsuario.atualizarEmail(nome, email);
                    }

                    case 4->{
                        String nome = ui.setNome("usuário");

                        dataUsuario.deletarUsuario(nome);
                    }

                }


            }

            case 2 -> {
                AlunoDAO dataAluno = new AlunoDAO();

                operacao = ui.mainMenu("Alunos");

                switch (operacao){

                    case 1 ->{
                        String aluno = ui.setNome("aluno");
                        String matricula = ui.setMatricula();
                        String curso = ui.setCurso();

                        dataAluno.inserir(aluno, matricula, curso);
                    }

                    case 3 ->{
                        String matricula = ui.setMatricula();
                        String curso = ui.setCurso();

                        //atualiza curso através da matrícula
                        dataAluno.atualizarCurso(curso, matricula);
                    }

                    case 4 ->{
                        String matricula = ui.setMatricula();
                        dataAluno.deletarAluno(matricula);
                    }
                }


            }

            case 3 -> {
                ProdutoDAO dataProduto = new ProdutoDAO();

                operacao = ui.mainMenu("Produtos");

                switch (operacao){

                    case 1->{
                        String produto = ui.setNome("produto");
                        double preco = ui.setPreco();
                        int quantidade = ui.setQuantidade();

                        dataProduto.inserir(produto, preco, quantidade);
                    }

                    case 3 ->{
                        String nome = ui.setNome("produto");
                        double preco = ui.setPreco();

                        //atualiza preço através do nome do produto
                        dataProduto.atualizarPreco(preco, nome);
                    }

                    case 4 ->{
                        String nome = ui.setNome("produto");
                        dataProduto.deletarProduto(nome);
                    }
                }


            }

            case 4 -> {
                PedidoDAO dataPedido = new PedidoDAO();

                operacao = ui.mainMenu("Pedidos");

                switch (operacao){

                    case 1 ->{
                        String cliente = ui.setNome("cliente");
                        String data = ui.setData();
                        double total = ui.setTotal();

                        dataPedido.inserir(cliente, data, total);
                    }

                    case 3 ->{
                        int id = ui.setId("cliente");
                        double total = ui.setTotal();

                        //atualiza total através do id
                        dataPedido.atualizarTotal(total, id);
                    }

                    case 4 ->{
                        int id = ui.setId("cliente");

                        dataPedido.deletarPedido(id);
                    }
                }


            }

            case 5 -> {
                LivroDAO dataLivro = new LivroDAO();

                operacao = ui.mainMenu("Livros");

                switch (operacao){

                    case 1 -> {
                        String titulo = ui.setNome("livro");
                        String autor = ui.setAutor();
                        int ano_publicacao = ui.setAnoPublicacao();

                        dataLivro.inserir(titulo, autor, ano_publicacao);

                    }

                    case 3 ->{
                        String titulo = ui.setNome("livro");
                        String autor = ui.setAutor();

                        //atualiza autor de um livro através título
                        dataLivro.atualizarAutor(autor, titulo);
                    }

                    case 4->{
                        String titulo = ui.setNome("livro");
                        dataLivro.deletarLivro(titulo);
                    }

                }
            }

            case 6 -> {
                FuncionarioDAO dataFuncionario = new FuncionarioDAO();

                operacao = ui.mainMenu("Funcionários");

                switch (operacao){

                    case 1 ->{
                        String nome = ui.setNome("funcionário");
                        String cargo = ui.setCargo();
                        double salario = ui.setSalario();

                        dataFuncionario.inserir(nome, cargo, salario);
                    }

                    case 3 ->{

                        String nome = ui.setNome("funcionário");
                        double salario = ui.setSalario();

                        dataFuncionario.atualizarSalario(salario, nome);
                    }

                    case 4 ->{

                        String nome = ui.setNome("funcionário");
                        dataFuncionario.deletarFuncionario(nome);
                    }
                }

            }

        }

    }

}
