package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInterface {

    Scanner input;

    public UserInterface(){
        input = new Scanner(System.in);
    }


    public int escolhaTabela(){
        System.out.println("+-----------------------------------| CADASTRO |----------------------------------+");
        System.out.println("|                                                                                 |");
        System.out.println("|    1 - Usuários                                                                 |");
        System.out.println("|    2 - Alunos                                                                   |");
        System.out.println("|    3 - Produtos                                                                 |");
        System.out.println("|    4 - Pedidos                                                                  |");
        System.out.println("|    5 - Livros                                                                   |");
        System.out.println("|    6 - Funcionários                                                             |");
        System.out.println("|                                                                                 |");
        System.out.println("+---------------------------------------------------------------------------------+");

        System.out.println("Digite a tabela que deseja acessar: > ");
        int tabela = input.nextInt();
        input.nextLine();

        return tabela;
    }

    public int mainMenu(String tabelaEscolha){
        System.out.println("+-----------------------------------| " + tabelaEscolha + " |----------------------------------+");
        System.out.println("|                                                                                 |");
        System.out.println("|    1 - Create                                                                   |");
        System.out.println("|    2 - Read                                                                     |");
        System.out.println("|    3 - Update                                                                   |");
        System.out.println("|    4 - Delete                                                                   |");
        System.out.println("|                                                                                 |");
        System.out.println("|                                                                    0- Sair      |");
        System.out.println("+---------------------------------------------------------------------------------+");

        int acaoCrud = input.nextInt();
        input.nextLine();

        return acaoCrud;
    }

    public String setNome(String tabela){
        System.out.printf("\nDigite o nome do %s: \n", tabela);
        return input.nextLine();
    }

    public String setEmail(){
        System.out.println("Digite o email: ");
        return input.nextLine();
    }

    public String setSenha(){
        System.out.println("Digite a senha: ");
        return input.nextLine();
    }

    public String setMatricula(){
        System.out.println("Digite a matricula: ");
        return input.nextLine();
    }

    public String setCurso(){
        System.out.println("Digite o curso: ");
        return input.nextLine();
    }

    public double setPreco(){
        System.out.println("Digite o preço: ");
        double preco = input.nextDouble();
        input.nextLine();

        return preco;
    }

    public int setQuantidade(){
        System.out.println("Digite a quantidade: ");
        int quantidade = input.nextInt();
        input.nextLine();

        return quantidade;
    }

    public String setData(){
        System.out.println("Digite a data do pedido (aaaa-mm-dd): ");
        return input.nextLine();
    }

    public double setTotal(){
        System.out.println("Digite o preço total: ");
        double total = input.nextDouble();
        input.nextLine();

        return total;
    }

    public String setAutor(){
        System.out.println("Digite o autor do livro: ");
        return input.nextLine();
    }

    public int setAnoPublicacao(){
        System.out.println("Digite o ano de publicação: ");
        int ano_publicacao = input.nextInt();
        input.nextLine();

        return ano_publicacao;
    }

    public String setCargo(){
        System.out.println("Digite o cargo do funcionário: ");
        return input.nextLine();
    }

    public double setSalario(){
        System.out.println("Digite o salário do funcionário: ");
        double salario = input.nextInt();
        input.nextLine();

        return salario;
    }

}
