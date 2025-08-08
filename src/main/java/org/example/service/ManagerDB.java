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
                        String senha = ui.setSenha();
                        String email = ui.setEmail();

                        dataUsuario.inserir(usuario, senha, email);
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
                }

            }

        }

    }

}
