package com.example.cadastroponto;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeFuncionario;
    private String matriculaFuncionario;
    private String horarioRegistro;

    public  long getId(){
        return id;

    }

    public void setId(long id){
        this.id = id;

    }

    public String getMatriculaFuncionario(){
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(String matriculaFuncionario){
        this.matriculaFuncionario = matriculaFuncionario;

    }
    public String getnomeFuncionario(){
        return nomeFuncionario;
    }

    public void setnomeFuncionario(String nomeFuncionario){
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getTimestamp(){
        return horarioRegistro;
    }

    public void setTimestamp(String timestamp){
        this.horarioRegistro = timestamp;
    }
}
