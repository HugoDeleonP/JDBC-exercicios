package org.example.model;

public class Usuario {

    private Integer id;
    private String nome;
    private String email;

    public Usuario(Integer id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Usuario(){
        this.id = null;
        this.nome = null;
        this.email = null;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        return
                "+----------------------------------| Usuário |------------------------------------+" + "\n" +
                "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Email: " + email + "\n" +
                "+---------------------------------------------------------------------------------+";
    }
}
