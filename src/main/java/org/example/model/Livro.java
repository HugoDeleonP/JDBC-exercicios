package org.example.model;

public class Livro {

    private Integer id;
    private String titulo;
    private String autor;
    private int ano_publicacao;

    public Livro(Integer id, String titulo, String autor, int ano_publicacao){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
    }

    public Livro(){
        this.id = null;
        this.titulo = null;
        this.autor = null;
        this.ano_publicacao = 0;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    @Override
    public String toString(){
        return
                "+-----------------------------------| Livro |-------------------------------------+" + "\n" +
                "ID: " + id + "\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Ano de publicação: " + ano_publicacao + "\n" +
                "+---------------------------------------------------------------------------------+";
    }
}
