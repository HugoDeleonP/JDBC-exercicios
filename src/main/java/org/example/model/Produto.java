package org.example.model;

public class Produto {

    private Integer id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(Integer id, String nome, double preco, int quantidade){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(){
        this.id = null;
        this.nome = null;
        this.preco = 0;
        this.quantidade = 0;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return
                "+-----------------------------------| Produto |-----------------------------------+" + "\n" +
                "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Preço: " + preco + "\n" +
                "Quantidade: " + quantidade + "\n" +
                "+---------------------------------------------------------------------------------+";

    }
}
