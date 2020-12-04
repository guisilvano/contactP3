package com.example.contactp3.api.models;

import java.io.Serializable;

public class RespostaUnesc implements Serializable {

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Boolean getSucesso() {
        return sucesso;
    }

    public void setSucesso(Boolean sucesso) {
        this.sucesso = sucesso;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    private String mensagem;
    private Boolean sucesso;
    private Long codigo;
}
