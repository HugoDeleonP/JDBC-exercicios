package org.example.model;

public class Funcionario {

    private Integer id;
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(Integer id, String nome, String cargo, double salario){
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(){
        this.id = null;
        this.nome = null;
        this.cargo = null;
        this.salario = 0;
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

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return
                "+--------------------------------| Funcionario |----------------------------------+" + "\n" +
                "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Cargo: " + cargo + "\n" +
                "Salário: " + salario + "\n" +
                "+---------------------------------------------------------------------------------+";
    }
}
