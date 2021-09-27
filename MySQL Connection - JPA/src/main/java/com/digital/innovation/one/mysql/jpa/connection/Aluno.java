package com.digital.innovation.one.mysql.jpa.connection;
import javax.persistence.*;

public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;

    @Column
    private int idade;

    @Column
    @ManyToOne(fetch = FetchType.EAGER)
    private Curso curso;

    public Aluno(int id, String nome, int idade, Curso curso){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public Aluno(String nome, int idade, Curso curso){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public Aluno(){};

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCurso(Curso curso){
        this.curso = curso;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Aluno: {");
        sb.append("id: ").append(id);
        sb.append(", nome: ").append(nome);
        sb.append(", idade: ").append(idade);
        sb.append(", curso: ").append(curso);
        sb.append("}");
        return sb.toString();
    };
}
