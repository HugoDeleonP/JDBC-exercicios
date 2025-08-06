package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInterface {

    Scanner input;

    public UserInterface(){
        input = new Scanner(System.in);
    }

    public String setUsuario(){
        System.out.println("Digite o nome do usuário: ");

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

    public int mainMenu(){
        System.out.println("+-----------------------------------| CADASTRO |----------------------------------+");
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
}
