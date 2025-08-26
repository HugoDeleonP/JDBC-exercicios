package org.example.model;

public class Aluno {

    private Integer id;
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(Integer id, String nome, String matricula, String curso){
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(){
        this.id = null;
        this.nome = null;
        this.matricula = null;
        this.curso = null;
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

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return
            "+------------------------------------| Aluno |------------------------------------+" + "\n" +
            "ID: " + id + "\n" +
            "Nome: " + nome + "\n" +
            "Matrícula: " + matricula + "\n" +
            "Curso: " + curso + "\n" +
            "+---------------------------------------------------------------------------------+";

    }
}
