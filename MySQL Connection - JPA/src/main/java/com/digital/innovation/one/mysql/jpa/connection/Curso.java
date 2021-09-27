package com.digital.innovation.one.mysql.jpa.connection;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;

    @Column
    @ManyToOne
    private Integer cargaHoraria;

    @Column
    private Integer QuantidadeAlunos;

    @OneToMany(mappedBy = "curso",
            orphanRemoval = true,
            cascade = CascadeType.ALL
    )
    List<Aluno> alunos = new ArrayList<>();

    public Curso(int id, String nome, int cargaHoraria, int QuantidadeAlunos){
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.QuantidadeAlunos = QuantidadeAlunos;
    }

    public Curso(String nome, int cargaHoraria, int QuantidadeAlunos){
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.QuantidadeAlunos = QuantidadeAlunos;
    }

    public Curso(){};

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int getQuantidadeAlunos() {
        return QuantidadeAlunos;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public void setQuantidadeAlunos(int QuantidadeAlunos){
        this.QuantidadeAlunos = QuantidadeAlunos;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Course: {");
        sb.append("id: ").append(id);
        sb.append(", name: ").append(nome);
        sb.append(", credits: ").append(cargaHoraria);
        sb.append(", students: ").append(QuantidadeAlunos);
        sb.append("}");
        return sb.toString();
    };
}
