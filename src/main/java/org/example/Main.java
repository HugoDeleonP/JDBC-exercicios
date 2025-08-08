package org.example;

import org.example.jdbc.dao.*;
import org.example.service.ManagerDB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        UserInterface viewer = new UserInterface();
        ManagerDB manager = new ManagerDB();

        int tabela = viewer.escolhaTabela();

        manager.tabela(tabela);

    }
}
