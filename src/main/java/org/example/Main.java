package org.example;

import org.example.jdbc.dao.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        UserInterface viewer = new UserInterface();

        int tabela = viewer.escolhaTabela();

        switch (tabela){

            case 1 ->{
                UsuarioDAO dataUsuario = new UsuarioDAO();

                String usuario = viewer.setUsuario();
                String senha = viewer.setSenha();
                String email = viewer.setEmail();

                dataUsuario.inserir(usuario, senha, email);
            }

            case 2 ->{
                AlunoDAO dataAluno = new AlunoDAO();

                System.out.println("Digite o nome do aluno: ");
                String nome = input.nextLine();

                System.out.println("Digite a matricula: ");
                String matricula = input.nextLine();

                System.out.println("Digite o curso: ");
                String curso = input.nextLine();

                dataAluno.inserir(nome, matricula, curso);
            }

            case 3 ->{
                ProdutoDAO dataProduto = new ProdutoDAO();

                System.out.println("Digite o nome do produto: ");
                String nome = input.nextLine();

                System.out.println("Digite o preço: ");
                double preco = input.nextDouble();

                System.out.println("Digite a quantidade: ");
                int quantidade = input.nextInt();

                dataProduto.inserir(nome, preco, quantidade);
            }

            case 4 ->{
                PedidoDAO dataPedido = new PedidoDAO();

                System.out.println("Digite o nome do cliente: ");
                String cliente = input.nextLine();

                System.out.println("Digite a data do pedido (aa-mm-dd): ");
                String data = input.nextLine();

                System.out.println("Digite o preço total: ");
                double total = input.nextDouble();

                dataPedido.inserir(cliente, data, total);
            }

            case 5 ->{
                LivroDAO dataLivro = new LivroDAO();

                System.out.println("Digite o título do livro: ");
                String titulo = input.nextLine();

                System.out.println("Digite o autor do livro: ");
                String autor = input.nextLine();

                System.out.println("Digite o ano de publicação: ");
                int ano_publicacao = input.nextInt();

                dataLivro.inserir(titulo, autor, ano_publicacao);

            }

            case 6 ->{
                System.out.println("Digite o nome do funcionário: ");
                String nome = input.nextLine();


            }
        }
    }
}
