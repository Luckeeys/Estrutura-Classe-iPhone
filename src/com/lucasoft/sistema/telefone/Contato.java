package com.lucasoft.sistema.telefone;

public class Contato {

    private String nome;
    private String telefone;
    private String apelido;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getApelido() {
        return apelido;
    }
}
