package com.example.contactp3.list;

public class ContatoModel {

    private String idContato;
    private String nomeContato;
    private String telefoneContato;

    public ContatoModel (final String idContato, final String nomeContato, final String telefoneContato){
        this.idContato = idContato;
        this.nomeContato = nomeContato;
        this.telefoneContato = telefoneContato;
    }

    public String getIdContato() {
        return idContato;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setIdContato(String idContato) {
        this.idContato = idContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
}
