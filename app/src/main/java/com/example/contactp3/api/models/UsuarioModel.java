package com.example.contactp3.api.models;

import java.io.Serializable;

public class UsuarioModel implements Serializable {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_conta() {
        return id_conta;
    }

    public void setId_conta(Long id_conta) {
        this.id_conta = id_conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    private Long id;
    private Long id_conta;          //codigo de aluno da unesc
    private String nome;
    private String senha;
    private Boolean habilitado;


}
