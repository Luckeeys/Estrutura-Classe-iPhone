package com.lucasoft.sistema.navegador;

public class Pagina {

    private String nome;
    private String url;
    private String conteudo;

    public Pagina(String nome, String url, String conteudo) {
        this.nome = nome;
        this.url = url;
        this.conteudo = conteudo;
    }

    public String getNome() {
        return nome;
    }

    public String getUrl() {
        return url;
    }

    public String getConteudo() {
        return conteudo;
    }
}
